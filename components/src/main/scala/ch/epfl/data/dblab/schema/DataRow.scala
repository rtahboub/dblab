package ch.epfl.data
package dblab
package schema

import sc.pardis.shallow.{ Record, OptimalString }

/**
 * @author Yannis Klonatos
 */
case class DataRow(values: Seq[(String, Any)]) extends Record {
  private val fieldMap = collection.mutable.HashMap[String, Any](values: _*)
  def numFields = fieldMap.size
  def getField(name: String): Option[Any] = fieldMap.get(name) match {
    case Some(fld) => Some(fld)
    case None =>
      var stop = false
      var res: Option[Any] = None
      for (f <- getNestedRecords() if !stop) {
        f.getField(name) match {
          case Some(r) => res = Some(r); stop = true;
          case None    =>
        }
      }
      res
  }
  def setField(name: String, value: Any) {
    if (!fieldMap.keySet.contains(name))
      throw new Exception("Cannot insert new field " + name + " in DataRow after its creation (existing fields are " + fieldMap.keySet + ")")
    fieldMap += name -> value
  }
  def getFieldNames() = fieldMap.keySet
  def getNestedRecords(): Seq[DataRow] = fieldMap.map({ case (k, v) => v }).filter(_.isInstanceOf[DataRow]).toSeq.asInstanceOf[Seq[DataRow]]
  override def toString = "DataRow(" + fieldMap.toSeq.toString + ")"
}