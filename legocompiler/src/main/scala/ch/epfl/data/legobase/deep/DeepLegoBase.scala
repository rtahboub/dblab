/* Generated by AutoLifter © 2014 */

package ch.epfl.data
package legobase
package deep

import scalalib._
import pardis.ir._

trait AGGRecordOps extends Base { this: DeepDSL =>
  implicit class AGGRecordRep[B](self: Rep[AGGRecord[B]])(implicit manifestB: Manifest[B]) {
    def key: Rep[B] = aGGRecord_Field_Key[B](self)(manifestB)
    def aggs: Rep[Array[Double]] = aGGRecord_Field_Aggs[B](self)(manifestB)
  }
  // constructors
  def __newAGGRecord[B](key: Rep[B], aggs: Rep[Array[Double]])(implicit manifestB: Manifest[B]): Rep[AGGRecord[B]] = aGGRecordNew[B](key, aggs)(manifestB)
  // case classes
  case class AGGRecordNew[B](key: Rep[B], aggs: Rep[Array[Double]])(implicit val manifestB: Manifest[B]) extends FunctionDef[AGGRecord[B]](None, "new AGGRecord", List(List(key, aggs)))
  case class AGGRecord_Field_Key[B](self: Rep[AGGRecord[B]])(implicit val manifestB: Manifest[B]) extends FieldDef[B](self, "key")
  case class AGGRecord_Field_Aggs[B](self: Rep[AGGRecord[B]])(implicit val manifestB: Manifest[B]) extends FieldDef[Array[Double]](self, "aggs")
  // method definitions
  def aGGRecordNew[B](key: Rep[B], aggs: Rep[Array[Double]])(implicit manifestB: Manifest[B]): Rep[AGGRecord[B]] = AGGRecordNew[B](key, aggs)
  def aGGRecord_Field_Key[B](self: Rep[AGGRecord[B]])(implicit manifestB: Manifest[B]): Rep[B] = AGGRecord_Field_Key[B](self)
  def aGGRecord_Field_Aggs[B](self: Rep[AGGRecord[B]])(implicit manifestB: Manifest[B]): Rep[Array[Double]] = AGGRecord_Field_Aggs[B](self)
  type AGGRecord[B] = ch.epfl.data.legobase.queryengine.AGGRecord[B]
}
trait AGGRecordImplicits { this: AGGRecordComponent =>
  // Add implicit conversions here!
}
trait AGGRecordComponent extends AGGRecordOps with AGGRecordImplicits { self: DeepDSL => }

trait LINEITEMRecordOps extends Base { this: DeepDSL =>
  implicit class LINEITEMRecordRep(self: Rep[LINEITEMRecord]) {
    def L_ORDERKEY: Rep[Int] = lINEITEMRecord_Field_L_ORDERKEY(self)
    def L_PARTKEY: Rep[Int] = lINEITEMRecord_Field_L_PARTKEY(self)
    def L_SUPPKEY: Rep[Int] = lINEITEMRecord_Field_L_SUPPKEY(self)
    def L_LINENUMBER: Rep[Int] = lINEITEMRecord_Field_L_LINENUMBER(self)
    def L_QUANTITY: Rep[Double] = lINEITEMRecord_Field_L_QUANTITY(self)
    def L_EXTENDEDPRICE: Rep[Double] = lINEITEMRecord_Field_L_EXTENDEDPRICE(self)
    def L_DISCOUNT: Rep[Double] = lINEITEMRecord_Field_L_DISCOUNT(self)
    def L_TAX: Rep[Double] = lINEITEMRecord_Field_L_TAX(self)
    def L_RETURNFLAG: Rep[Character] = lINEITEMRecord_Field_L_RETURNFLAG(self)
    def L_LINESTATUS: Rep[Character] = lINEITEMRecord_Field_L_LINESTATUS(self)
    def L_SHIPDATE: Rep[Long] = lINEITEMRecord_Field_L_SHIPDATE(self)
    def L_COMMITDATE: Rep[Long] = lINEITEMRecord_Field_L_COMMITDATE(self)
    def L_RECEIPTDATE: Rep[Long] = lINEITEMRecord_Field_L_RECEIPTDATE(self)
    def L_SHIPINSTRUCT: Rep[Array[Byte]] = lINEITEMRecord_Field_L_SHIPINSTRUCT(self)
    def L_SHIPMODE: Rep[Array[Byte]] = lINEITEMRecord_Field_L_SHIPMODE(self)
    def L_COMMENT: Rep[Array[Byte]] = lINEITEMRecord_Field_L_COMMENT(self)
  }
  // constructors
  def __newLINEITEMRecord(L_ORDERKEY: Rep[Int], L_PARTKEY: Rep[Int], L_SUPPKEY: Rep[Int], L_LINENUMBER: Rep[Int], L_QUANTITY: Rep[Double], L_EXTENDEDPRICE: Rep[Double], L_DISCOUNT: Rep[Double], L_TAX: Rep[Double], L_RETURNFLAG: Rep[Character], L_LINESTATUS: Rep[Character], L_SHIPDATE: Rep[Long], L_COMMITDATE: Rep[Long], L_RECEIPTDATE: Rep[Long], L_SHIPINSTRUCT: Rep[Array[Byte]], L_SHIPMODE: Rep[Array[Byte]], L_COMMENT: Rep[Array[Byte]]): Rep[LINEITEMRecord] = lINEITEMRecordNew(L_ORDERKEY, L_PARTKEY, L_SUPPKEY, L_LINENUMBER, L_QUANTITY, L_EXTENDEDPRICE, L_DISCOUNT, L_TAX, L_RETURNFLAG, L_LINESTATUS, L_SHIPDATE, L_COMMITDATE, L_RECEIPTDATE, L_SHIPINSTRUCT, L_SHIPMODE, L_COMMENT)
  // case classes
  case class LINEITEMRecordNew(L_ORDERKEY: Rep[Int], L_PARTKEY: Rep[Int], L_SUPPKEY: Rep[Int], L_LINENUMBER: Rep[Int], L_QUANTITY: Rep[Double], L_EXTENDEDPRICE: Rep[Double], L_DISCOUNT: Rep[Double], L_TAX: Rep[Double], L_RETURNFLAG: Rep[Character], L_LINESTATUS: Rep[Character], L_SHIPDATE: Rep[Long], L_COMMITDATE: Rep[Long], L_RECEIPTDATE: Rep[Long], L_SHIPINSTRUCT: Rep[Array[Byte]], L_SHIPMODE: Rep[Array[Byte]], L_COMMENT: Rep[Array[Byte]]) extends FunctionDef[LINEITEMRecord](None, "new LINEITEMRecord", List(List(L_ORDERKEY, L_PARTKEY, L_SUPPKEY, L_LINENUMBER, L_QUANTITY, L_EXTENDEDPRICE, L_DISCOUNT, L_TAX, L_RETURNFLAG, L_LINESTATUS, L_SHIPDATE, L_COMMITDATE, L_RECEIPTDATE, L_SHIPINSTRUCT, L_SHIPMODE, L_COMMENT)))
  case class LINEITEMRecord_Field_L_ORDERKEY(self: Rep[LINEITEMRecord]) extends FieldDef[Int](self, "L_ORDERKEY")
  case class LINEITEMRecord_Field_L_PARTKEY(self: Rep[LINEITEMRecord]) extends FieldDef[Int](self, "L_PARTKEY")
  case class LINEITEMRecord_Field_L_SUPPKEY(self: Rep[LINEITEMRecord]) extends FieldDef[Int](self, "L_SUPPKEY")
  case class LINEITEMRecord_Field_L_LINENUMBER(self: Rep[LINEITEMRecord]) extends FieldDef[Int](self, "L_LINENUMBER")
  case class LINEITEMRecord_Field_L_QUANTITY(self: Rep[LINEITEMRecord]) extends FieldDef[Double](self, "L_QUANTITY")
  case class LINEITEMRecord_Field_L_EXTENDEDPRICE(self: Rep[LINEITEMRecord]) extends FieldDef[Double](self, "L_EXTENDEDPRICE")
  case class LINEITEMRecord_Field_L_DISCOUNT(self: Rep[LINEITEMRecord]) extends FieldDef[Double](self, "L_DISCOUNT")
  case class LINEITEMRecord_Field_L_TAX(self: Rep[LINEITEMRecord]) extends FieldDef[Double](self, "L_TAX")
  case class LINEITEMRecord_Field_L_RETURNFLAG(self: Rep[LINEITEMRecord]) extends FieldDef[Character](self, "L_RETURNFLAG")
  case class LINEITEMRecord_Field_L_LINESTATUS(self: Rep[LINEITEMRecord]) extends FieldDef[Character](self, "L_LINESTATUS")
  case class LINEITEMRecord_Field_L_SHIPDATE(self: Rep[LINEITEMRecord]) extends FieldDef[Long](self, "L_SHIPDATE")
  case class LINEITEMRecord_Field_L_COMMITDATE(self: Rep[LINEITEMRecord]) extends FieldDef[Long](self, "L_COMMITDATE")
  case class LINEITEMRecord_Field_L_RECEIPTDATE(self: Rep[LINEITEMRecord]) extends FieldDef[Long](self, "L_RECEIPTDATE")
  case class LINEITEMRecord_Field_L_SHIPINSTRUCT(self: Rep[LINEITEMRecord]) extends FieldDef[Array[Byte]](self, "L_SHIPINSTRUCT")
  case class LINEITEMRecord_Field_L_SHIPMODE(self: Rep[LINEITEMRecord]) extends FieldDef[Array[Byte]](self, "L_SHIPMODE")
  case class LINEITEMRecord_Field_L_COMMENT(self: Rep[LINEITEMRecord]) extends FieldDef[Array[Byte]](self, "L_COMMENT")
  // method definitions
  def lINEITEMRecordNew(L_ORDERKEY: Rep[Int], L_PARTKEY: Rep[Int], L_SUPPKEY: Rep[Int], L_LINENUMBER: Rep[Int], L_QUANTITY: Rep[Double], L_EXTENDEDPRICE: Rep[Double], L_DISCOUNT: Rep[Double], L_TAX: Rep[Double], L_RETURNFLAG: Rep[Character], L_LINESTATUS: Rep[Character], L_SHIPDATE: Rep[Long], L_COMMITDATE: Rep[Long], L_RECEIPTDATE: Rep[Long], L_SHIPINSTRUCT: Rep[Array[Byte]], L_SHIPMODE: Rep[Array[Byte]], L_COMMENT: Rep[Array[Byte]]): Rep[LINEITEMRecord] = LINEITEMRecordNew(L_ORDERKEY, L_PARTKEY, L_SUPPKEY, L_LINENUMBER, L_QUANTITY, L_EXTENDEDPRICE, L_DISCOUNT, L_TAX, L_RETURNFLAG, L_LINESTATUS, L_SHIPDATE, L_COMMITDATE, L_RECEIPTDATE, L_SHIPINSTRUCT, L_SHIPMODE, L_COMMENT)
  def lINEITEMRecord_Field_L_ORDERKEY(self: Rep[LINEITEMRecord]): Rep[Int] = LINEITEMRecord_Field_L_ORDERKEY(self)
  def lINEITEMRecord_Field_L_PARTKEY(self: Rep[LINEITEMRecord]): Rep[Int] = LINEITEMRecord_Field_L_PARTKEY(self)
  def lINEITEMRecord_Field_L_SUPPKEY(self: Rep[LINEITEMRecord]): Rep[Int] = LINEITEMRecord_Field_L_SUPPKEY(self)
  def lINEITEMRecord_Field_L_LINENUMBER(self: Rep[LINEITEMRecord]): Rep[Int] = LINEITEMRecord_Field_L_LINENUMBER(self)
  def lINEITEMRecord_Field_L_QUANTITY(self: Rep[LINEITEMRecord]): Rep[Double] = LINEITEMRecord_Field_L_QUANTITY(self)
  def lINEITEMRecord_Field_L_EXTENDEDPRICE(self: Rep[LINEITEMRecord]): Rep[Double] = LINEITEMRecord_Field_L_EXTENDEDPRICE(self)
  def lINEITEMRecord_Field_L_DISCOUNT(self: Rep[LINEITEMRecord]): Rep[Double] = LINEITEMRecord_Field_L_DISCOUNT(self)
  def lINEITEMRecord_Field_L_TAX(self: Rep[LINEITEMRecord]): Rep[Double] = LINEITEMRecord_Field_L_TAX(self)
  def lINEITEMRecord_Field_L_RETURNFLAG(self: Rep[LINEITEMRecord]): Rep[Character] = LINEITEMRecord_Field_L_RETURNFLAG(self)
  def lINEITEMRecord_Field_L_LINESTATUS(self: Rep[LINEITEMRecord]): Rep[Character] = LINEITEMRecord_Field_L_LINESTATUS(self)
  def lINEITEMRecord_Field_L_SHIPDATE(self: Rep[LINEITEMRecord]): Rep[Long] = LINEITEMRecord_Field_L_SHIPDATE(self)
  def lINEITEMRecord_Field_L_COMMITDATE(self: Rep[LINEITEMRecord]): Rep[Long] = LINEITEMRecord_Field_L_COMMITDATE(self)
  def lINEITEMRecord_Field_L_RECEIPTDATE(self: Rep[LINEITEMRecord]): Rep[Long] = LINEITEMRecord_Field_L_RECEIPTDATE(self)
  def lINEITEMRecord_Field_L_SHIPINSTRUCT(self: Rep[LINEITEMRecord]): Rep[Array[Byte]] = LINEITEMRecord_Field_L_SHIPINSTRUCT(self)
  def lINEITEMRecord_Field_L_SHIPMODE(self: Rep[LINEITEMRecord]): Rep[Array[Byte]] = LINEITEMRecord_Field_L_SHIPMODE(self)
  def lINEITEMRecord_Field_L_COMMENT(self: Rep[LINEITEMRecord]): Rep[Array[Byte]] = LINEITEMRecord_Field_L_COMMENT(self)
  type LINEITEMRecord = ch.epfl.data.legobase.storagemanager.TPCHRelations.LINEITEMRecord
}
trait LINEITEMRecordImplicits { this: LINEITEMRecordComponent =>
  // Add implicit conversions here!
}
trait LINEITEMRecordComponent extends LINEITEMRecordOps with LINEITEMRecordImplicits { self: DeepDSL => }

trait K2DBScannerOps extends Base { this: DeepDSL =>
  implicit class K2DBScannerRep(self: Rep[K2DBScanner]) {
    def next_int(): Rep[Int] = k2DBScannerNext_int(self)
    def next_double(): Rep[Double] = k2DBScannerNext_double(self)
    def next_char(): Rep[Char] = k2DBScannerNext_char(self)
    def next(buf: Rep[Array[Byte]])(implicit overload1: Overloaded1): Rep[Int] = k2DBScannerNext1(self, buf)
    def next(buf: Rep[Array[Byte]], offset: Rep[Int])(implicit overload2: Overloaded2): Rep[Int] = k2DBScannerNext2(self, buf, offset)
    def next_date(): Rep[Long] = k2DBScannerNext_date(self)
    def hasNext(): Rep[Boolean] = k2DBScannerHasNext(self)
    def filename(): Rep[String] = k2DBScanner_Field_Filename(self)
    def byteRead: Rep[Int] = k2DBScanner_Field_ByteRead(self)
    def byteRead_=(x$1: Rep[Int]): Rep[Unit] = k2DBScanner_Field_ByteRead_$eq(self, x$1)
    def intDigits: Rep[Int] = k2DBScanner_Field_IntDigits(self)
    def intDigits_=(x$1: Rep[Int]): Rep[Unit] = k2DBScanner_Field_IntDigits_$eq(self, x$1)
    def delimiter: Rep[Char] = k2DBScanner_Field_Delimiter(self)
    def delimiter_=(x$1: Rep[Char]): Rep[Unit] = k2DBScanner_Field_Delimiter_$eq(self, x$1)
  }
  // constructors
  def __newK2DBScanner(filename: Rep[String]): Rep[K2DBScanner] = k2DBScannerNew(filename)
  // case classes
  case class K2DBScannerNew(filename: Rep[String]) extends FunctionDef[K2DBScanner](None, "new K2DBScanner", List(List(filename)))
  case class K2DBScannerNext_int(self: Rep[K2DBScanner]) extends FunctionDef[Int](Some(self), "next_int", List())
  case class K2DBScannerNext_double(self: Rep[K2DBScanner]) extends FunctionDef[Double](Some(self), "next_double", List())
  case class K2DBScannerNext_char(self: Rep[K2DBScanner]) extends FunctionDef[Char](Some(self), "next_char", List())
  case class K2DBScannerNext1(self: Rep[K2DBScanner], buf: Rep[Array[Byte]]) extends FunctionDef[Int](Some(self), "next", List(List(buf)))
  case class K2DBScannerNext2(self: Rep[K2DBScanner], buf: Rep[Array[Byte]], offset: Rep[Int]) extends FunctionDef[Int](Some(self), "next", List(List(buf, offset)))
  case class K2DBScannerNext_date(self: Rep[K2DBScanner]) extends FunctionDef[Long](Some(self), "next_date", List())
  case class K2DBScannerHasNext(self: Rep[K2DBScanner]) extends FunctionDef[Boolean](Some(self), "hasNext", List())
  case class K2DBScanner_Field_Filename(self: Rep[K2DBScanner]) extends FieldDef[String](self, "filename")
  case class K2DBScanner_Field_ByteRead(self: Rep[K2DBScanner]) extends FieldDef[Int](self, "byteRead")
  case class K2DBScanner_Field_ByteRead_$eq(self: Rep[K2DBScanner], x$1: Rep[Int]) extends FunctionDef[Unit](Some(self), "byteRead_$eq", List(List(x$1)))
  case class K2DBScanner_Field_IntDigits(self: Rep[K2DBScanner]) extends FieldDef[Int](self, "intDigits")
  case class K2DBScanner_Field_IntDigits_$eq(self: Rep[K2DBScanner], x$1: Rep[Int]) extends FunctionDef[Unit](Some(self), "intDigits_$eq", List(List(x$1)))
  case class K2DBScanner_Field_Delimiter(self: Rep[K2DBScanner]) extends FieldDef[Char](self, "delimiter")
  case class K2DBScanner_Field_Delimiter_$eq(self: Rep[K2DBScanner], x$1: Rep[Char]) extends FunctionDef[Unit](Some(self), "delimiter_$eq", List(List(x$1)))
  // method definitions
  def k2DBScannerNew(filename: Rep[String]): Rep[K2DBScanner] = K2DBScannerNew(filename)
  def k2DBScannerNext_int(self: Rep[K2DBScanner]): Rep[Int] = K2DBScannerNext_int(self)
  def k2DBScannerNext_double(self: Rep[K2DBScanner]): Rep[Double] = K2DBScannerNext_double(self)
  def k2DBScannerNext_char(self: Rep[K2DBScanner]): Rep[Char] = K2DBScannerNext_char(self)
  def k2DBScannerNext1(self: Rep[K2DBScanner], buf: Rep[Array[Byte]]): Rep[Int] = K2DBScannerNext1(self, buf)
  def k2DBScannerNext2(self: Rep[K2DBScanner], buf: Rep[Array[Byte]], offset: Rep[Int]): Rep[Int] = K2DBScannerNext2(self, buf, offset)
  def k2DBScannerNext_date(self: Rep[K2DBScanner]): Rep[Long] = K2DBScannerNext_date(self)
  def k2DBScannerHasNext(self: Rep[K2DBScanner]): Rep[Boolean] = K2DBScannerHasNext(self)
  def k2DBScanner_Field_Filename(self: Rep[K2DBScanner]): Rep[String] = K2DBScanner_Field_Filename(self)
  def k2DBScanner_Field_ByteRead(self: Rep[K2DBScanner]): Rep[Int] = K2DBScanner_Field_ByteRead(self)
  def k2DBScanner_Field_ByteRead_$eq(self: Rep[K2DBScanner], x$1: Rep[Int]): Rep[Unit] = K2DBScanner_Field_ByteRead_$eq(self, x$1)
  def k2DBScanner_Field_IntDigits(self: Rep[K2DBScanner]): Rep[Int] = K2DBScanner_Field_IntDigits(self)
  def k2DBScanner_Field_IntDigits_$eq(self: Rep[K2DBScanner], x$1: Rep[Int]): Rep[Unit] = K2DBScanner_Field_IntDigits_$eq(self, x$1)
  def k2DBScanner_Field_Delimiter(self: Rep[K2DBScanner]): Rep[Char] = K2DBScanner_Field_Delimiter(self)
  def k2DBScanner_Field_Delimiter_$eq(self: Rep[K2DBScanner], x$1: Rep[Char]): Rep[Unit] = K2DBScanner_Field_Delimiter_$eq(self, x$1)
  type K2DBScanner = ch.epfl.data.legobase.storagemanager.K2DBScanner
}
trait K2DBScannerImplicits { this: K2DBScannerComponent =>
  // Add implicit conversions here!
}
trait K2DBScannerComponent extends K2DBScannerOps with K2DBScannerImplicits { self: DeepDSL => }

trait DeepDSL extends OperatorsComponent with AGGRecordComponent with CharacterComponent
  with DoubleComponent with IntComponent with LongComponent with ArrayComponent
  with LINEITEMRecordComponent with K2DBScannerComponent with IntegerComponent
  with BooleanComponent with HashMapComponent with SetComponent with TreeSetComponent
  with DefaultEntryComponent with ManualLiftedLegoBase

