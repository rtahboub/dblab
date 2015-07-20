/* Generated by Purgatory 2014-2015 */

package ch.epfl.data.dblab.legobase.deep.queryengine.monad

import ch.epfl.data.sc.pardis
import pardis.ir._
import pardis.types.PardisTypeImplicits._
import pardis.effects._
import pardis.deep._
import pardis.deep.scalalib._
import pardis.deep.scalalib.collection._
import pardis.deep.scalalib.io._
trait QueryOps extends Base with ListOps with ArrayOps { this: GroupedQueryOps =>
  // Type representation
  val QueryType = QueryIRs.QueryType
  type QueryType[T] = QueryIRs.QueryType[T]
  implicit def typeQuery[T: TypeRep]: TypeRep[Query[T]] = QueryType(implicitly[TypeRep[T]])
  implicit class QueryRep[T](self: Rep[Query[T]])(implicit typeT: TypeRep[T]) {
    def map[S](f: Rep[(T => S)])(implicit typeS: TypeRep[S]): Rep[Query[S]] = queryMap[T, S](self, f)(typeT, typeS)
    def filter(p: Rep[(T => Boolean)]): Rep[Query[T]] = queryFilter[T](self, p)(typeT)
    def foldLeft[S](z: Rep[S])(f: Rep[((S, T) => S)])(implicit typeS: TypeRep[S]): Rep[S] = queryFoldLeft[T, S](self, z, f)(typeT, typeS)
    def foreach(f: Rep[(T => Unit)]): Rep[Unit] = queryForeach[T](self, f)(typeT)
    def sum(implicit num: Numeric[T]): Rep[T] = querySum[T](self)(typeT, num)
    def count: Rep[Int] = queryCount[T](self)(typeT)
    def avg(implicit num: Fractional[T]): Rep[T] = queryAvg[T](self)(typeT, num)
    def groupBy[K](par: Rep[(T => K)])(implicit typeK: TypeRep[K]): Rep[GroupedQuery[K, T]] = queryGroupBy[T, K](self, par)(typeT, typeK)
    def filteredGroupBy[K](pred: Rep[(T => Boolean)], par: Rep[(T => K)])(implicit typeK: TypeRep[K]): Rep[GroupedQuery[K, T]] = queryFilteredGroupBy[T, K](self, pred, par)(typeT, typeK)
    def sortBy[S](f: Rep[(T => S)])(implicit typeS: TypeRep[S], ord: Ordering[S]): Rep[Query[T]] = querySortBy[T, S](self, f)(typeT, typeS, ord)
    def underlying: Rep[List[T]] = query_Field_Underlying[T](self)(typeT)
  }
  object Query {

  }
  // constructors
  def __newQuery[T](underlying: Rep[List[T]])(implicit overload1: Overloaded1, typeT: TypeRep[T]): Rep[Query[T]] = queryNew1[T](underlying)(typeT)
  def __newQuery[T](arr: Rep[Array[T]])(implicit overload2: Overloaded2, typeT: TypeRep[T]): Rep[Query[T]] = queryNew2[T](arr)(typeT)
  // IR defs
  val QueryNew1 = QueryIRs.QueryNew1
  type QueryNew1[T] = QueryIRs.QueryNew1[T]
  val QueryNew2 = QueryIRs.QueryNew2
  type QueryNew2[T] = QueryIRs.QueryNew2[T]
  val QueryMap = QueryIRs.QueryMap
  type QueryMap[T, S] = QueryIRs.QueryMap[T, S]
  val QueryFilter = QueryIRs.QueryFilter
  type QueryFilter[T] = QueryIRs.QueryFilter[T]
  val QueryFoldLeft = QueryIRs.QueryFoldLeft
  type QueryFoldLeft[T, S] = QueryIRs.QueryFoldLeft[T, S]
  val QueryForeach = QueryIRs.QueryForeach
  type QueryForeach[T] = QueryIRs.QueryForeach[T]
  val QuerySum = QueryIRs.QuerySum
  type QuerySum[T] = QueryIRs.QuerySum[T]
  val QueryCount = QueryIRs.QueryCount
  type QueryCount[T] = QueryIRs.QueryCount[T]
  val QueryAvg = QueryIRs.QueryAvg
  type QueryAvg[T] = QueryIRs.QueryAvg[T]
  val QueryGroupBy = QueryIRs.QueryGroupBy
  type QueryGroupBy[T, K] = QueryIRs.QueryGroupBy[T, K]
  val QueryFilteredGroupBy = QueryIRs.QueryFilteredGroupBy
  type QueryFilteredGroupBy[T, K] = QueryIRs.QueryFilteredGroupBy[T, K]
  val QuerySortBy = QueryIRs.QuerySortBy
  type QuerySortBy[T, S] = QueryIRs.QuerySortBy[T, S]
  val Query_Field_Underlying = QueryIRs.Query_Field_Underlying
  type Query_Field_Underlying[T] = QueryIRs.Query_Field_Underlying[T]
  // method definitions
  def queryNew1[T](underlying: Rep[List[T]])(implicit typeT: TypeRep[T]): Rep[Query[T]] = QueryNew1[T](underlying)
  def queryNew2[T](arr: Rep[Array[T]])(implicit typeT: TypeRep[T]): Rep[Query[T]] = QueryNew2[T](arr)
  def queryMap[T, S](self: Rep[Query[T]], f: Rep[((T) => S)])(implicit typeT: TypeRep[T], typeS: TypeRep[S]): Rep[Query[S]] = QueryMap[T, S](self, f)
  def queryFilter[T](self: Rep[Query[T]], p: Rep[((T) => Boolean)])(implicit typeT: TypeRep[T]): Rep[Query[T]] = QueryFilter[T](self, p)
  def queryFoldLeft[T, S](self: Rep[Query[T]], z: Rep[S], f: Rep[((S, T) => S)])(implicit typeT: TypeRep[T], typeS: TypeRep[S]): Rep[S] = QueryFoldLeft[T, S](self, z, f)
  def queryForeach[T](self: Rep[Query[T]], f: Rep[((T) => Unit)])(implicit typeT: TypeRep[T]): Rep[Unit] = QueryForeach[T](self, f)
  def querySum[T](self: Rep[Query[T]])(implicit typeT: TypeRep[T], num: Numeric[T]): Rep[T] = QuerySum[T](self)
  def queryCount[T](self: Rep[Query[T]])(implicit typeT: TypeRep[T]): Rep[Int] = QueryCount[T](self)
  def queryAvg[T](self: Rep[Query[T]])(implicit typeT: TypeRep[T], num: Fractional[T]): Rep[T] = QueryAvg[T](self)
  def queryGroupBy[T, K](self: Rep[Query[T]], par: Rep[((T) => K)])(implicit typeT: TypeRep[T], typeK: TypeRep[K]): Rep[GroupedQuery[K, T]] = QueryGroupBy[T, K](self, par)
  def queryFilteredGroupBy[T, K](self: Rep[Query[T]], pred: Rep[((T) => Boolean)], par: Rep[((T) => K)])(implicit typeT: TypeRep[T], typeK: TypeRep[K]): Rep[GroupedQuery[K, T]] = QueryFilteredGroupBy[T, K](self, pred, par)
  def querySortBy[T, S](self: Rep[Query[T]], f: Rep[((T) => S)])(implicit typeT: TypeRep[T], typeS: TypeRep[S], ord: Ordering[S]): Rep[Query[T]] = QuerySortBy[T, S](self, f)
  def query_Field_Underlying[T](self: Rep[Query[T]])(implicit typeT: TypeRep[T]): Rep[List[T]] = Query_Field_Underlying[T](self)
  type Query[T] = ch.epfl.data.dblab.legobase.queryengine.monad.Query[T]
}
object QueryIRs extends Base {
  import ListIRs._
  import ArrayIRs._
  import GroupedQueryIRs._
  // Type representation
  case class QueryType[T](typeT: TypeRep[T]) extends TypeRep[Query[T]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = QueryType(newArguments(0).asInstanceOf[TypeRep[_]])
    private implicit val tagT = typeT.typeTag
    val name = s"Query[${typeT.name}]"
    val typeArguments = List(typeT)

    val typeTag = scala.reflect.runtime.universe.typeTag[Query[T]]
  }
  implicit def typeQuery[T: TypeRep]: TypeRep[Query[T]] = QueryType(implicitly[TypeRep[T]])
  // case classes
  case class QueryNew1[T](underlying: Rep[List[T]])(implicit val typeT: TypeRep[T]) extends ConstructorDef[Query[T]](List(typeT), "Query", List(List(underlying))) {
    override def curriedConstructor = (copy[T] _)
  }

  case class QueryNew2[T](arr: Rep[Array[T]])(implicit val typeT: TypeRep[T]) extends ConstructorDef[Query[T]](List(typeT), "Query", List(List(arr))) {
    override def curriedConstructor = (copy[T] _)
  }

  case class QueryMap[T, S](self: Rep[Query[T]], f: Rep[((T) => S)])(implicit val typeT: TypeRep[T], val typeS: TypeRep[S]) extends FunctionDef[Query[S]](Some(self), "map", List(List(f))) {
    override def curriedConstructor = (copy[T, S] _).curried
    override def isPure = true

    override def partiallyEvaluate(children: Any*): Query[S] = {
      val self = children(0).asInstanceOf[Query[T]]
      val f = children(1).asInstanceOf[((T) => S)]
      self.map[S](f)
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QueryFilter[T](self: Rep[Query[T]], p: Rep[((T) => Boolean)])(implicit val typeT: TypeRep[T]) extends FunctionDef[Query[T]](Some(self), "filter", List(List(p))) {
    override def curriedConstructor = (copy[T] _).curried
    override def isPure = true

    override def partiallyEvaluate(children: Any*): Query[T] = {
      val self = children(0).asInstanceOf[Query[T]]
      val p = children(1).asInstanceOf[((T) => Boolean)]
      self.filter(p)
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QueryFoldLeft[T, S](self: Rep[Query[T]], z: Rep[S], f: Rep[((S, T) => S)])(implicit val typeT: TypeRep[T], val typeS: TypeRep[S]) extends FunctionDef[S](Some(self), "foldLeft", List(List(z), List(f))) {
    override def curriedConstructor = (copy[T, S] _).curried
    override def isPure = true

    override def partiallyEvaluate(children: Any*): S = {
      val self = children(0).asInstanceOf[Query[T]]
      val z = children(1).asInstanceOf[S]
      val f = children(2).asInstanceOf[((S, T) => S)]
      self.foldLeft[S](z)(f)
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QueryForeach[T](self: Rep[Query[T]], f: Rep[((T) => Unit)])(implicit val typeT: TypeRep[T]) extends FunctionDef[Unit](Some(self), "foreach", List(List(f))) {
    override def curriedConstructor = (copy[T] _).curried
  }

  case class QuerySum[T](self: Rep[Query[T]])(implicit val typeT: TypeRep[T], val num: Numeric[T]) extends FunctionDef[T](Some(self), "sum", List()) {
    override def curriedConstructor = (copy[T] _)
    override def isPure = true

    override def partiallyEvaluate(children: Any*): T = {
      val self = children(0).asInstanceOf[Query[T]]
      self.sum
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QueryCount[T](self: Rep[Query[T]])(implicit val typeT: TypeRep[T]) extends FunctionDef[Int](Some(self), "count", List()) {
    override def curriedConstructor = (copy[T] _)
    override def isPure = true

    override def partiallyEvaluate(children: Any*): Int = {
      val self = children(0).asInstanceOf[Query[T]]
      self.count
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QueryAvg[T](self: Rep[Query[T]])(implicit val typeT: TypeRep[T], val num: Fractional[T]) extends FunctionDef[T](Some(self), "avg", List()) {
    override def curriedConstructor = (copy[T] _)
    override def isPure = true

    override def partiallyEvaluate(children: Any*): T = {
      val self = children(0).asInstanceOf[Query[T]]
      self.avg
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QueryGroupBy[T, K](self: Rep[Query[T]], par: Rep[((T) => K)])(implicit val typeT: TypeRep[T], val typeK: TypeRep[K]) extends FunctionDef[GroupedQuery[K, T]](Some(self), "groupBy", List(List(par))) {
    override def curriedConstructor = (copy[T, K] _).curried
    override def isPure = true

    override def partiallyEvaluate(children: Any*): GroupedQuery[K, T] = {
      val self = children(0).asInstanceOf[Query[T]]
      val par = children(1).asInstanceOf[((T) => K)]
      self.groupBy[K](par)
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QueryFilteredGroupBy[T, K](self: Rep[Query[T]], pred: Rep[((T) => Boolean)], par: Rep[((T) => K)])(implicit val typeT: TypeRep[T], val typeK: TypeRep[K]) extends FunctionDef[GroupedQuery[K, T]](Some(self), "filteredGroupBy", List(List(pred, par))) {
    override def curriedConstructor = (copy[T, K] _).curried
    override def isPure = true

    override def partiallyEvaluate(children: Any*): GroupedQuery[K, T] = {
      val self = children(0).asInstanceOf[Query[T]]
      val pred = children(1).asInstanceOf[((T) => Boolean)]
      val par = children(2).asInstanceOf[((T) => K)]
      self.filteredGroupBy[K](pred, par)
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class QuerySortBy[T, S](self: Rep[Query[T]], f: Rep[((T) => S)])(implicit val typeT: TypeRep[T], val typeS: TypeRep[S], val ord: Ordering[S]) extends FunctionDef[Query[T]](Some(self), "sortBy", List(List(f))) {
    override def curriedConstructor = (copy[T, S] _).curried
    override def isPure = true

    override def partiallyEvaluate(children: Any*): Query[T] = {
      val self = children(0).asInstanceOf[Query[T]]
      val f = children(1).asInstanceOf[((T) => S)]
      self.sortBy[S](f)
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class Query_Field_Underlying[T](self: Rep[Query[T]])(implicit val typeT: TypeRep[T]) extends FieldDef[List[T]](self, "underlying") {
    override def curriedConstructor = (copy[T] _)
    override def isPure = true

  }

  type Query[T] = ch.epfl.data.dblab.legobase.queryengine.monad.Query[T]
}
trait QueryImplicits extends QueryOps { this: GroupedQueryOps =>
  // Add implicit conversions here!
}
trait QueryPartialEvaluation extends QueryComponent with BasePartialEvaluation { this: GroupedQueryOps =>
  // Immutable field inlining 
  override def query_Field_Underlying[T](self: Rep[Query[T]])(implicit typeT: TypeRep[T]): Rep[List[T]] = self match {
    case Def(node: QueryNew1[_]) => node.underlying
    case _                       => super.query_Field_Underlying[T](self)(typeT)
  }

  // Mutable field inlining 
  // Pure function partial evaluation
}
trait QueryComponent extends QueryOps with QueryImplicits { this: GroupedQueryOps => }
trait GroupedQueryOps extends Base with Tuple2Ops with QueryOps with MapOps with ListOps {
  // Type representation
  val GroupedQueryType = GroupedQueryIRs.GroupedQueryType
  type GroupedQueryType[K, V] = GroupedQueryIRs.GroupedQueryType[K, V]
  implicit def typeGroupedQuery[K: TypeRep, V: TypeRep]: TypeRep[GroupedQuery[K, V]] = GroupedQueryType(implicitly[TypeRep[K]], implicitly[TypeRep[V]])
  implicit class GroupedQueryRep[K, V](self: Rep[GroupedQuery[K, V]])(implicit typeK: TypeRep[K], typeV: TypeRep[V]) {
    def mapValues[S](f: Rep[(Query[V] => S)])(implicit typeS: TypeRep[S]): Rep[Query[Tuple2[K, S]]] = groupedQueryMapValues[K, V, S](self, f)(typeK, typeV, typeS)
    def underlying: Rep[Map[K, List[V]]] = groupedQuery_Field_Underlying[K, V](self)(typeK, typeV)
  }
  object GroupedQuery {

  }
  // constructors
  def __newGroupedQuery[K, V](underlying: Rep[Map[K, List[V]]])(implicit typeK: TypeRep[K], typeV: TypeRep[V]): Rep[GroupedQuery[K, V]] = groupedQueryNew[K, V](underlying)(typeK, typeV)
  // IR defs
  val GroupedQueryNew = GroupedQueryIRs.GroupedQueryNew
  type GroupedQueryNew[K, V] = GroupedQueryIRs.GroupedQueryNew[K, V]
  val GroupedQueryMapValues = GroupedQueryIRs.GroupedQueryMapValues
  type GroupedQueryMapValues[K, V, S] = GroupedQueryIRs.GroupedQueryMapValues[K, V, S]
  val GroupedQuery_Field_Underlying = GroupedQueryIRs.GroupedQuery_Field_Underlying
  type GroupedQuery_Field_Underlying[K, V] = GroupedQueryIRs.GroupedQuery_Field_Underlying[K, V]
  // method definitions
  def groupedQueryNew[K, V](underlying: Rep[Map[K, List[V]]])(implicit typeK: TypeRep[K], typeV: TypeRep[V]): Rep[GroupedQuery[K, V]] = GroupedQueryNew[K, V](underlying)
  def groupedQueryMapValues[K, V, S](self: Rep[GroupedQuery[K, V]], f: Rep[((Query[V]) => S)])(implicit typeK: TypeRep[K], typeV: TypeRep[V], typeS: TypeRep[S]): Rep[Query[Tuple2[K, S]]] = GroupedQueryMapValues[K, V, S](self, f)
  def groupedQuery_Field_Underlying[K, V](self: Rep[GroupedQuery[K, V]])(implicit typeK: TypeRep[K], typeV: TypeRep[V]): Rep[Map[K, List[V]]] = GroupedQuery_Field_Underlying[K, V](self)
  type GroupedQuery[K, V] = ch.epfl.data.dblab.legobase.queryengine.monad.GroupedQuery[K, V]
}
object GroupedQueryIRs extends Base {
  import Tuple2IRs._
  import QueryIRs._
  import MapIRs._
  import ListIRs._
  // Type representation
  case class GroupedQueryType[K, V](typeK: TypeRep[K], typeV: TypeRep[V]) extends TypeRep[GroupedQuery[K, V]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = GroupedQueryType(newArguments(0).asInstanceOf[TypeRep[_]], newArguments(1).asInstanceOf[TypeRep[_]])
    private implicit val tagK = typeK.typeTag
    private implicit val tagV = typeV.typeTag
    val name = s"GroupedQuery[${typeK.name}, ${typeV.name}]"
    val typeArguments = List(typeK, typeV)

    val typeTag = scala.reflect.runtime.universe.typeTag[GroupedQuery[K, V]]
  }
  implicit def typeGroupedQuery[K: TypeRep, V: TypeRep]: TypeRep[GroupedQuery[K, V]] = GroupedQueryType(implicitly[TypeRep[K]], implicitly[TypeRep[V]])
  // case classes
  case class GroupedQueryNew[K, V](underlying: Rep[Map[K, List[V]]])(implicit val typeK: TypeRep[K], val typeV: TypeRep[V]) extends ConstructorDef[GroupedQuery[K, V]](List(typeK, typeV), "GroupedQuery", List(List(underlying))) {
    override def curriedConstructor = (copy[K, V] _)
  }

  case class GroupedQueryMapValues[K, V, S](self: Rep[GroupedQuery[K, V]], f: Rep[((Query[V]) => S)])(implicit val typeK: TypeRep[K], val typeV: TypeRep[V], val typeS: TypeRep[S]) extends FunctionDef[Query[Tuple2[K, S]]](Some(self), "mapValues", List(List(f))) {
    override def curriedConstructor = (copy[K, V, S] _).curried
    override def isPure = true

    override def partiallyEvaluate(children: Any*): Query[Tuple2[K, S]] = {
      val self = children(0).asInstanceOf[GroupedQuery[K, V]]
      val f = children(1).asInstanceOf[((Query[V]) => S)]
      self.mapValues[S](f)
    }
    override def partiallyEvaluable: Boolean = true

  }

  case class GroupedQuery_Field_Underlying[K, V](self: Rep[GroupedQuery[K, V]])(implicit val typeK: TypeRep[K], val typeV: TypeRep[V]) extends FieldDef[Map[K, List[V]]](self, "underlying") {
    override def curriedConstructor = (copy[K, V] _)
    override def isPure = true

  }

  type GroupedQuery[K, V] = ch.epfl.data.dblab.legobase.queryengine.monad.GroupedQuery[K, V]
}
trait GroupedQueryImplicits extends GroupedQueryOps {
  // Add implicit conversions here!
}
trait GroupedQueryPartialEvaluation extends GroupedQueryComponent with BasePartialEvaluation {
  // Immutable field inlining 
  override def groupedQuery_Field_Underlying[K, V](self: Rep[GroupedQuery[K, V]])(implicit typeK: TypeRep[K], typeV: TypeRep[V]): Rep[Map[K, List[V]]] = self match {
    case Def(node: GroupedQueryNew[_, _]) => node.underlying
    case _                                => super.groupedQuery_Field_Underlying[K, V](self)(typeK, typeV)
  }

  // Mutable field inlining 
  // Pure function partial evaluation
}
trait GroupedQueryComponent extends GroupedQueryOps with GroupedQueryImplicits {}
