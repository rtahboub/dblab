package ch.epfl.data
package dblab.legobase

import tpch._
import schema._
import frontend._
import utils.Utilities._
import java.io.PrintStream

/**
 * The common trait for all Query Runners (either a Query Interpreter or a Query Compiler)
 */
trait LegoRunner {
  var currQuery: java.lang.String = ""
  Config.checkResults = true

  def getOutputName = currQuery + "Output.txt"

  /**
   * Executes the given TPCH query with the given scaling factor.
   *
   * This method should be implemented by a query interpreter to interpret the given
   * query or by a query compiler to compile the given query.
   *
   * @param query the input TPCH query (TODO should be generalized)
   */
  def executeQuery(query: String, schema: Schema): Unit

  /**
   * The starting point of a query runner which uses the arguments as its setting.
   *
   * @param args the setting arguments passed through command line
   */
  def run(args: Array[String]) {

    val sf = if (args(1).contains(".")) args(1).toDouble.toString else args(1).toInt.toString
    Config.sf = sf.toDouble
    Config.datapath = args(0) + "/sf" + sf + "/"

    val excludedQueries = Nil

    val stmt = SQLParser.parse("SELECT * FROM LINEITEM WHERE " +
      " L_SHIPDATE >= DATE '1996-01-01' AND L_SHIPDATE < DATE '1997-01-01'" +
      " AND L_DISCOUNT BETWEEN 0.07 - 0.01 AND 0.07 + 0.01 " +
      " AND L_QUANTITY < 24.0;")
    System.out.println(stmt)

    val schema: Schema = TPCHSchema.getSchema(Config.datapath, Config.sf) // TODO-GEN : This should be given as argument
    new SQLSemanticCheckerAndTypeInference(schema).checkAndInfer(stmt)
    val qp = new SQLTreeToQueryPlanConverter(schema).convert(stmt)
    System.exit(0)

    val queries: scala.collection.immutable.List[String] =
      if (args.length >= 3 && args(2) == "testsuite-scala") (for (i <- 1 to 22 if !excludedQueries.contains(i)) yield "Q" + i).toList
      else if (args.length >= 3 && args(2) == "testsuite-c") (for (i <- 1 to 22 if !excludedQueries.contains(i)) yield "Q" + i + "_C").toList
      else args.drop(2).filter(x => !x.startsWith("+") && !x.startsWith("-")).toList
    for (q <- queries) {
      currQuery = q
      Console.withOut(new PrintStream(getOutputName)) {
        executeQuery(currQuery, schema)
        // Check results
        if (Config.checkResults) {
          val getResultFileName = "results/" + currQuery + ".result_sf" + sf
          val resq = scala.io.Source.fromFile(getOutputName).mkString
          if (new java.io.File(getResultFileName).exists) {
            val resc = {
              val str = scala.io.Source.fromFile(getResultFileName).mkString
              str * Config.numRuns
            }
            if (resq != resc) {
              System.out.println("-----------------------------------------")
              System.out.println("QUERY" + q + " DID NOT RETURN CORRECT RESULT!!!")
              System.out.println("Correct result:")
              System.out.println(resc)
              System.out.println("Result obtained from execution:")
              System.out.println(resq)
              System.out.println("-----------------------------------------")
              System.exit(0)
            } else System.out.println("CHECK RESULT FOR QUERY " + q + ": [OK]")
          } else {
            System.out.println("Reference result file not found. Skipping checking of result")
            System.out.println("Execution results:")
            System.out.println(resq)
          }
        }
      }
    }
  }
}
