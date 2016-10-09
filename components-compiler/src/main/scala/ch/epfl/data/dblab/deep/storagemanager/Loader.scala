/* Generated by Purgatory 2014-2016 */

package ch.epfl.data.dblab.deep.storagemanager
import ch.epfl.data.dblab.deep._
import ch.epfl.data.dblab.deep.queryengine._
import ch.epfl.data.dblab.deep.schema._
import ch.epfl.data.dblab.schema._
import scala.reflect._

import ch.epfl.data.sc.pardis
import pardis.ir._
import pardis.types.PardisTypeImplicits._
import pardis.effects._
import pardis.deep._
import pardis.deep.scalalib._
import pardis.deep.scalalib.collection._
import pardis.deep.scalalib.io._

import ch.epfl.data.sc.pardis.quasi.anf.{ BaseExt, BaseExtIR }
import ch.epfl.data.sc.pardis.quasi.TypeParameters.MaybeParamTag

trait LoaderOps extends Base with FastScannerOps with ArrayOps with OptimalStringOps with StringOps with NumericOps with DynamicDataRowOps {
  // Type representation
  val LoaderType = LoaderIRs.LoaderType
  implicit val typeLoader: TypeRep[Loader] = LoaderType
  implicit class LoaderRep(self: Rep[Loader]) {

  }
  object Loader {
    def getFullPath(fileName: Rep[String]): Rep[String] = loaderGetFullPathObject(fileName)
    def loadString(size: Rep[Int], s: Rep[FastScanner]): Rep[OptimalString] = loaderLoadStringObject(size, s)
    def fileLineCount(file: Rep[String]): Rep[Int] = loaderFileLineCountObject(file)
    def loadUntypedTable(table: Rep[Table]): Rep[Array[DynamicDataRow]] = loaderLoadUntypedTableObject(table)
    def loadTable[R](table: Rep[Table])(implicit typeR: TypeRep[R], c: ClassTag[R]): Rep[Array[R]] = loaderLoadTableObject[R](table)(typeR, c)
  }
  // constructors

  // IR defs
  val LoaderGetFullPathObject = LoaderIRs.LoaderGetFullPathObject
  type LoaderGetFullPathObject = LoaderIRs.LoaderGetFullPathObject
  val LoaderLoadStringObject = LoaderIRs.LoaderLoadStringObject
  type LoaderLoadStringObject = LoaderIRs.LoaderLoadStringObject
  val LoaderFileLineCountObject = LoaderIRs.LoaderFileLineCountObject
  type LoaderFileLineCountObject = LoaderIRs.LoaderFileLineCountObject
  val LoaderLoadUntypedTableObject = LoaderIRs.LoaderLoadUntypedTableObject
  type LoaderLoadUntypedTableObject = LoaderIRs.LoaderLoadUntypedTableObject
  val LoaderLoadTableObject = LoaderIRs.LoaderLoadTableObject
  type LoaderLoadTableObject[R] = LoaderIRs.LoaderLoadTableObject[R]
  // method definitions
  def loaderGetFullPathObject(fileName: Rep[String]): Rep[String] = LoaderGetFullPathObject(fileName)
  def loaderLoadStringObject(size: Rep[Int], s: Rep[FastScanner]): Rep[OptimalString] = LoaderLoadStringObject(size, s)
  def loaderFileLineCountObject(file: Rep[String]): Rep[Int] = LoaderFileLineCountObject(file)
  def loaderLoadUntypedTableObject(table: Rep[Table]): Rep[Array[DynamicDataRow]] = LoaderLoadUntypedTableObject(table)
  def loaderLoadTableObject[R](table: Rep[Table])(implicit typeR: TypeRep[R], c: ClassTag[R]): Rep[Array[R]] = LoaderLoadTableObject[R](table)
  type Loader = ch.epfl.data.dblab.storagemanager.Loader
}
object LoaderIRs extends Base {
  import FastScannerIRs._
  import ArrayIRs._
  import OptimalStringIRs._
  import StringIRs._
  import NumericIRs._
  import DynamicDataRowIRs._
  // Type representation
  case object LoaderType extends TypeRep[Loader] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = LoaderType
    val name = "Loader"
    val typeArguments = Nil
  }
  implicit val typeLoader: TypeRep[Loader] = LoaderType
  // case classes
  case class LoaderGetFullPathObject(fileName: Rep[String]) extends FunctionDef[String](None, "Loader.getFullPath", List(List(fileName))) {
    override def curriedConstructor = (copy _)
  }

  case class LoaderLoadStringObject(size: Rep[Int], s: Rep[FastScanner]) extends FunctionDef[OptimalString](None, "Loader.loadString", List(List(size, s))) {
    override def curriedConstructor = (copy _).curried
  }

  case class LoaderFileLineCountObject(file: Rep[String]) extends FunctionDef[Int](None, "Loader.fileLineCount", List(List(file))) {
    override def curriedConstructor = (copy _)
  }

  case class LoaderLoadUntypedTableObject(table: Rep[Table]) extends FunctionDef[Array[DynamicDataRow]](None, "Loader.loadUntypedTable", List(List(table))) {
    override def curriedConstructor = (copy _)
  }

  case class LoaderLoadTableObject[R](table: Rep[Table])(implicit val typeR: TypeRep[R], val c: ClassTag[R]) extends FunctionDef[Array[R]](None, "Loader.loadTable", List(List(table)), List(typeR)) {
    override def curriedConstructor = (copy[R] _)
  }

  type Loader = ch.epfl.data.dblab.storagemanager.Loader
}
trait LoaderImplicits extends LoaderOps {
  // Add implicit conversions here!
}
trait LoaderComponent extends LoaderOps with LoaderImplicits {}

trait LoaderImplementations extends LoaderOps {

}

trait LoaderPartialEvaluation extends LoaderComponent with BasePartialEvaluation {
  // Immutable field inlining 

  // Mutable field inlining 
  // Pure function partial evaluation
}

