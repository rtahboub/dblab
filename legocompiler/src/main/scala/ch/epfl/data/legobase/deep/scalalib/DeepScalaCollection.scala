/* Generated by AutoLifter © 2014 */

package ch.epfl.data
package legobase
package deep
package scalalib

import pardis.ir._
import pardis.ir.pardisTypeImplicits._

trait HashMapOps extends Base { this: DeepDSL =>
  implicit class HashMapRep[A, B](self: Rep[HashMap[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]) {
    def getOrElseUpdate(key: Rep[A], op: => Rep[B]): Rep[B] = hashMapGetOrElseUpdate[A, B](self, key, op)(typeA, typeB)
    def clear(): Rep[Unit] = hashMapClear[A, B](self)(typeA, typeB)
    def size: Rep[Int] = hashMapSize[A, B](self)(typeA, typeB)
    def contains(key: Rep[A]): Rep[Boolean] = hashMapContains[A, B](self, key)(typeA, typeB)
    def apply(key: Rep[A]): Rep[B] = hashMapApply[A, B](self, key)(typeA, typeB)
    def update(key: Rep[A], value: Rep[B]): Rep[Unit] = hashMapUpdate[A, B](self, key, value)(typeA, typeB)
    def remove(key: Rep[A]): Rep[Option[B]] = hashMapRemove[A, B](self, key)(typeA, typeB)
    def keySet: Rep[Set[A]] = hashMapKeySet[A, B](self)(typeA, typeB)
    def contents: Rep[Contents[A, DefaultEntry[A, B]]] = hashMap_Field_Contents[A, B](self)(typeA, typeB)
  }
  object HashMap {

  }
  // constructors
  def __newHashMap[A, B](contents: Rep[Contents[A, DefaultEntry[A, B]]])(implicit overload1: Overloaded1, typeA: TypeRep[A], typeB: TypeRep[B]): Rep[HashMap[A, B]] = hashMapNew1[A, B](contents)(typeA, typeB)
  def __newHashMap[A, B]()(implicit overload2: Overloaded2, typeA: TypeRep[A], typeB: TypeRep[B]): Rep[HashMap[A, B]] = hashMapNew2[A, B]()(typeA, typeB)
  // case classes
  case class HashMapNew1[A, B](contents: Rep[Contents[A, DefaultEntry[A, B]]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends ConstructorDef[HashMap[A, B]](List(typeA, typeB), "HashMap", List(List(contents))) {
    override def curriedConstructor = (copy[A, B] _)
  }

  case class HashMapNew2[A, B]()(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends ConstructorDef[HashMap[A, B]](List(typeA, typeB), "HashMap", List(List())) {
    override def curriedConstructor = (x: Any) => copy[A, B]()
  }

  case class HashMapGetOrElseUpdate[A, B](self: Rep[HashMap[A, B]], key: Rep[A], opOutput: Block[B])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[B](Some(self), "getOrElseUpdate", List(List(key, opOutput))) {
    override def curriedConstructor = (copy[A, B] _).curried
  }

  case class HashMapClear[A, B](self: Rep[HashMap[A, B]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[Unit](Some(self), "clear", List(List())) {
    override def curriedConstructor = (copy[A, B] _)
  }

  case class HashMapSize[A, B](self: Rep[HashMap[A, B]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[Int](Some(self), "size", List()) {
    override def curriedConstructor = (copy[A, B] _)
    override def isPure = true

  }

  case class HashMapContains[A, B](self: Rep[HashMap[A, B]], key: Rep[A])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[Boolean](Some(self), "contains", List(List(key))) {
    override def curriedConstructor = (copy[A, B] _).curried
    override def isPure = true

  }

  case class HashMapApply[A, B](self: Rep[HashMap[A, B]], key: Rep[A])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[B](Some(self), "apply", List(List(key))) {
    override def curriedConstructor = (copy[A, B] _).curried
    override def isPure = true

  }

  case class HashMapUpdate[A, B](self: Rep[HashMap[A, B]], key: Rep[A], value: Rep[B])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[Unit](Some(self), "update", List(List(key, value))) {
    override def curriedConstructor = (copy[A, B] _).curried
  }

  case class HashMapRemove[A, B](self: Rep[HashMap[A, B]], key: Rep[A])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[Option[B]](Some(self), "remove", List(List(key))) {
    override def curriedConstructor = (copy[A, B] _).curried
  }

  case class HashMapKeySet[A, B](self: Rep[HashMap[A, B]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[Set[A]](Some(self), "keySet", List()) {
    override def curriedConstructor = (copy[A, B] _)
    override def isPure = true

  }

  case class HashMap_Field_Contents[A, B](self: Rep[HashMap[A, B]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FieldDef[Contents[A, DefaultEntry[A, B]]](self, "contents") {
    override def curriedConstructor = (copy[A, B] _)
    override def isPure = true

  }

  // method definitions
  def hashMapNew1[A, B](contents: Rep[Contents[A, DefaultEntry[A, B]]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[HashMap[A, B]] = HashMapNew1[A, B](contents)
  def hashMapNew2[A, B]()(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[HashMap[A, B]] = HashMapNew2[A, B]()
  def hashMapGetOrElseUpdate[A, B](self: Rep[HashMap[A, B]], key: Rep[A], op: => Rep[B])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[B] = {
    val opOutput = reifyBlock(op)
    HashMapGetOrElseUpdate[A, B](self, key, opOutput)
  }
  def hashMapClear[A, B](self: Rep[HashMap[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Unit] = HashMapClear[A, B](self)
  def hashMapSize[A, B](self: Rep[HashMap[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Int] = HashMapSize[A, B](self)
  def hashMapContains[A, B](self: Rep[HashMap[A, B]], key: Rep[A])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Boolean] = HashMapContains[A, B](self, key)
  def hashMapApply[A, B](self: Rep[HashMap[A, B]], key: Rep[A])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[B] = HashMapApply[A, B](self, key)
  def hashMapUpdate[A, B](self: Rep[HashMap[A, B]], key: Rep[A], value: Rep[B])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Unit] = HashMapUpdate[A, B](self, key, value)
  def hashMapRemove[A, B](self: Rep[HashMap[A, B]], key: Rep[A])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Option[B]] = HashMapRemove[A, B](self, key)
  def hashMapKeySet[A, B](self: Rep[HashMap[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Set[A]] = HashMapKeySet[A, B](self)
  def hashMap_Field_Contents[A, B](self: Rep[HashMap[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Contents[A, DefaultEntry[A, B]]] = HashMap_Field_Contents[A, B](self)
  type HashMap[A, B] = scala.collection.mutable.HashMap[A, B]
  case class HashMapType[A, B](typeA: TypeRep[A], typeB: TypeRep[B]) extends TypeRep[HashMap[A, B]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = HashMapType(newArguments(0).asInstanceOf[TypeRep[_]], newArguments(1).asInstanceOf[TypeRep[_]])
    private implicit val tagA = typeA.typeTag
    private implicit val tagB = typeB.typeTag
    val name = s"HashMap[${typeA.name}, ${typeB.name}]"
    val typeArguments = List(typeA, typeB)

    val typeTag = scala.reflect.runtime.universe.typeTag[HashMap[A, B]]
  }
  implicit def typeHashMap[A: TypeRep, B: TypeRep] = HashMapType(implicitly[TypeRep[A]], implicitly[TypeRep[B]])
}
trait HashMapImplicits { this: HashMapComponent =>
  // Add implicit conversions here!
}
trait HashMapImplementations { self: DeepDSL =>

}
trait HashMapComponent extends HashMapOps with HashMapImplicits { self: DeepDSL => }

trait SetOps extends Base { this: DeepDSL =>
  implicit class SetRep[A](self: Rep[Set[A]])(implicit typeA: TypeRep[A]) {
    def head: Rep[A] = setHead[A](self)(typeA)
    def apply(elem: Rep[A]): Rep[Boolean] = setApply[A](self, elem)(typeA)
    def toSeq: Rep[Seq[A]] = setToSeq[A](self)(typeA)
    def remove(elem: Rep[A]): Rep[Boolean] = setRemove[A](self, elem)(typeA)
    def +(elem: Rep[A]): Rep[Set[A]] = set$plus[A](self, elem)(typeA)
    def +=(elem: Rep[A]): Rep[Set[A]] = set$plus$eq[A](self, elem)(typeA)
  }
  object Set {
    def apply[T](elems: Rep[Seq[T]])(implicit typeT: TypeRep[T], overload1: Overloaded1): Rep[Set[T]] = setApplyObject1[T](elems)(typeT)
    def apply[T]()(implicit typeT: TypeRep[T], overload2: Overloaded2): Rep[Set[T]] = setApplyObject2[T]()(typeT)
  }
  // constructors

  // case classes
  case class SetHead[A](self: Rep[Set[A]])(implicit val typeA: TypeRep[A]) extends FunctionDef[A](Some(self), "head", List()) {
    override def curriedConstructor = (copy[A] _)
  }

  case class SetApply[A](self: Rep[Set[A]], elem: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[Boolean](Some(self), "apply", List(List(elem))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class SetToSeq[A](self: Rep[Set[A]])(implicit val typeA: TypeRep[A]) extends FunctionDef[Seq[A]](Some(self), "toSeq", List()) {
    override def curriedConstructor = (copy[A] _)
  }

  case class SetRemove[A](self: Rep[Set[A]], elem: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[Boolean](Some(self), "remove", List(List(elem))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class Set$plus[A](self: Rep[Set[A]], elem: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[Set[A]](Some(self), "+", List(List(elem))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class Set$plus$eq[A](self: Rep[Set[A]], elem: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[Set[A]](Some(self), "+=", List(List(elem))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class SetApplyObject1[T](elems: Rep[Seq[T]])(implicit val typeT: TypeRep[T]) extends FunctionDef[Set[T]](None, "Set.apply", List(List(elems))) {
    override def curriedConstructor = (copy[T] _)
  }

  case class SetApplyObject2[T]()(implicit val typeT: TypeRep[T]) extends FunctionDef[Set[T]](None, "Set.apply", List(List())) {
    override def curriedConstructor = (x: Any) => copy[T]()
  }

  // method definitions
  def setHead[A](self: Rep[Set[A]])(implicit typeA: TypeRep[A]): Rep[A] = SetHead[A](self)
  def setApply[A](self: Rep[Set[A]], elem: Rep[A])(implicit typeA: TypeRep[A]): Rep[Boolean] = SetApply[A](self, elem)
  def setToSeq[A](self: Rep[Set[A]])(implicit typeA: TypeRep[A]): Rep[Seq[A]] = SetToSeq[A](self)
  def setRemove[A](self: Rep[Set[A]], elem: Rep[A])(implicit typeA: TypeRep[A]): Rep[Boolean] = SetRemove[A](self, elem)
  def set$plus[A](self: Rep[Set[A]], elem: Rep[A])(implicit typeA: TypeRep[A]): Rep[Set[A]] = Set$plus[A](self, elem)
  def set$plus$eq[A](self: Rep[Set[A]], elem: Rep[A])(implicit typeA: TypeRep[A]): Rep[Set[A]] = Set$plus$eq[A](self, elem)
  def setApplyObject1[T](elems: Rep[Seq[T]])(implicit typeT: TypeRep[T]): Rep[Set[T]] = SetApplyObject1[T](elems)
  def setApplyObject2[T]()(implicit typeT: TypeRep[T]): Rep[Set[T]] = SetApplyObject2[T]()
  type Set[A] = scala.collection.mutable.Set[A]
  case class SetType[A](typeA: TypeRep[A]) extends TypeRep[Set[A]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = SetType(newArguments(0).asInstanceOf[TypeRep[_]])
    private implicit val tagA = typeA.typeTag
    val name = s"Set[${typeA.name}]"
    val typeArguments = List(typeA)

    val typeTag = scala.reflect.runtime.universe.typeTag[Set[A]]
  }
  implicit def typeSet[A: TypeRep] = SetType(implicitly[TypeRep[A]])
}
trait SetImplicits { this: SetComponent =>
  // Add implicit conversions here!
}
trait SetImplementations { self: DeepDSL =>

}
trait SetComponent extends SetOps with SetImplicits { self: DeepDSL => }

trait TreeSetOps extends Base { this: DeepDSL =>
  implicit class TreeSetRep[A](self: Rep[TreeSet[A]])(implicit typeA: TypeRep[A]) {
    def head: Rep[A] = treeSetHead[A](self)(typeA)
    def size: Rep[Int] = treeSetSize[A](self)(typeA)
    def -=(elem: Rep[A]): Rep[TreeSet[A]] = treeSet$minus$eq[A](self, elem)(typeA)
    def +=(elem: Rep[A]): Rep[TreeSet[A]] = treeSet$plus$eq[A](self, elem)(typeA)
    def ordering: Rep[Ordering[A]] = treeSet_Field_Ordering[A](self)(typeA)
  }
  object TreeSet {

  }
  // constructors
  def __newTreeSet[A]()(ordering: Rep[Ordering[A]])(implicit typeA: TypeRep[A]): Rep[TreeSet[A]] = treeSetNew[A](ordering)(typeA)
  // case classes
  case class TreeSetNew[A](ordering: Rep[Ordering[A]])(implicit val typeA: TypeRep[A]) extends ConstructorDef[TreeSet[A]](List(typeA), "TreeSet", List(List(), List(ordering))) {
    override def curriedConstructor = (copy[A] _)
  }

  case class TreeSetHead[A](self: Rep[TreeSet[A]])(implicit val typeA: TypeRep[A]) extends FunctionDef[A](Some(self), "head", List()) {
    override def curriedConstructor = (copy[A] _)
    override def isPure = true

  }

  case class TreeSetSize[A](self: Rep[TreeSet[A]])(implicit val typeA: TypeRep[A]) extends FunctionDef[Int](Some(self), "size", List()) {
    override def curriedConstructor = (copy[A] _)
    override def isPure = true

  }

  case class TreeSet$minus$eq[A](self: Rep[TreeSet[A]], elem: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[TreeSet[A]](Some(self), "-=", List(List(elem))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class TreeSet$plus$eq[A](self: Rep[TreeSet[A]], elem: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[TreeSet[A]](Some(self), "+=", List(List(elem))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class TreeSet_Field_Ordering[A](self: Rep[TreeSet[A]])(implicit val typeA: TypeRep[A]) extends FieldDef[Ordering[A]](self, "ordering") {
    override def curriedConstructor = (copy[A] _)
    override def isPure = true

  }

  // method definitions
  def treeSetNew[A](ordering: Rep[Ordering[A]])(implicit typeA: TypeRep[A]): Rep[TreeSet[A]] = TreeSetNew[A](ordering)
  def treeSetHead[A](self: Rep[TreeSet[A]])(implicit typeA: TypeRep[A]): Rep[A] = TreeSetHead[A](self)
  def treeSetSize[A](self: Rep[TreeSet[A]])(implicit typeA: TypeRep[A]): Rep[Int] = TreeSetSize[A](self)
  def treeSet$minus$eq[A](self: Rep[TreeSet[A]], elem: Rep[A])(implicit typeA: TypeRep[A]): Rep[TreeSet[A]] = TreeSet$minus$eq[A](self, elem)
  def treeSet$plus$eq[A](self: Rep[TreeSet[A]], elem: Rep[A])(implicit typeA: TypeRep[A]): Rep[TreeSet[A]] = TreeSet$plus$eq[A](self, elem)
  def treeSet_Field_Ordering[A](self: Rep[TreeSet[A]])(implicit typeA: TypeRep[A]): Rep[Ordering[A]] = TreeSet_Field_Ordering[A](self)
  type TreeSet[A] = scala.collection.mutable.TreeSet[A]
  case class TreeSetType[A](typeA: TypeRep[A]) extends TypeRep[TreeSet[A]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = TreeSetType(newArguments(0).asInstanceOf[TypeRep[_]])
    private implicit val tagA = typeA.typeTag
    val name = s"TreeSet[${typeA.name}]"
    val typeArguments = List(typeA)

    val typeTag = scala.reflect.runtime.universe.typeTag[TreeSet[A]]
  }
  implicit def typeTreeSet[A: TypeRep] = TreeSetType(implicitly[TypeRep[A]])
}
trait TreeSetImplicits { this: TreeSetComponent =>
  // Add implicit conversions here!
}
trait TreeSetImplementations { self: DeepDSL =>

}
trait TreeSetComponent extends TreeSetOps with TreeSetImplicits { self: DeepDSL => }

trait DefaultEntryOps extends Base { this: DeepDSL =>
  implicit class DefaultEntryRep[A, B](self: Rep[DefaultEntry[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]) {
    def chainString: Rep[String] = defaultEntryChainString[A, B](self)(typeA, typeB)
    def value_=(x$1: Rep[B]): Rep[Unit] = defaultEntry_Field_Value_$eq[A, B](self, x$1)(typeA, typeB)
    def value: Rep[B] = defaultEntry_Field_Value[A, B](self)(typeA, typeB)
    def key: Rep[A] = defaultEntry_Field_Key[A, B](self)(typeA, typeB)
  }
  object DefaultEntry {

  }
  // constructors
  def __newDefaultEntry[A, B](key: Rep[A], value: Rep[B])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[DefaultEntry[A, B]] = defaultEntryNew[A, B](key, value)(typeA, typeB)
  // case classes
  case class DefaultEntryNew[A, B](key: Rep[A], value: Rep[B])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends ConstructorDef[DefaultEntry[A, B]](List(typeA, typeB), "DefaultEntry", List(List(key, value))) {
    override def curriedConstructor = (copy[A, B] _).curried
  }

  case class DefaultEntryChainString[A, B](self: Rep[DefaultEntry[A, B]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[String](Some(self), "chainString", List()) {
    override def curriedConstructor = (copy[A, B] _)
  }

  case class DefaultEntry_Field_Value_$eq[A, B](self: Rep[DefaultEntry[A, B]], x$1: Rep[B])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FieldSetter[B](self, "value", x$1) {
    override def curriedConstructor = (copy[A, B] _).curried
  }

  case class DefaultEntry_Field_Value[A, B](self: Rep[DefaultEntry[A, B]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FieldGetter[B](self, "value") {
    override def curriedConstructor = (copy[A, B] _)
  }

  case class DefaultEntry_Field_Key[A, B](self: Rep[DefaultEntry[A, B]])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FieldDef[A](self, "key") {
    override def curriedConstructor = (copy[A, B] _)
    override def isPure = true

  }

  // method definitions
  def defaultEntryNew[A, B](key: Rep[A], value: Rep[B])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[DefaultEntry[A, B]] = DefaultEntryNew[A, B](key, value)
  def defaultEntryChainString[A, B](self: Rep[DefaultEntry[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[String] = DefaultEntryChainString[A, B](self)
  def defaultEntry_Field_Value_$eq[A, B](self: Rep[DefaultEntry[A, B]], x$1: Rep[B])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[Unit] = DefaultEntry_Field_Value_$eq[A, B](self, x$1)
  def defaultEntry_Field_Value[A, B](self: Rep[DefaultEntry[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[B] = DefaultEntry_Field_Value[A, B](self)
  def defaultEntry_Field_Key[A, B](self: Rep[DefaultEntry[A, B]])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[A] = DefaultEntry_Field_Key[A, B](self)
  type DefaultEntry[A, B] = scala.collection.mutable.DefaultEntry[A, B]
  case class DefaultEntryType[A, B](typeA: TypeRep[A], typeB: TypeRep[B]) extends TypeRep[DefaultEntry[A, B]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = DefaultEntryType(newArguments(0).asInstanceOf[TypeRep[_]], newArguments(1).asInstanceOf[TypeRep[_]])
    private implicit val tagA = typeA.typeTag
    private implicit val tagB = typeB.typeTag
    val name = s"DefaultEntry[${typeA.name}, ${typeB.name}]"
    val typeArguments = List(typeA, typeB)

    val typeTag = scala.reflect.runtime.universe.typeTag[DefaultEntry[A, B]]
  }
  implicit def typeDefaultEntry[A: TypeRep, B: TypeRep] = DefaultEntryType(implicitly[TypeRep[A]], implicitly[TypeRep[B]])
}
trait DefaultEntryImplicits { this: DefaultEntryComponent =>
  // Add implicit conversions here!
}
trait DefaultEntryImplementations { self: DeepDSL =>

}
trait DefaultEntryComponent extends DefaultEntryOps with DefaultEntryImplicits { self: DeepDSL => }

trait ArrayBufferOps extends Base { this: DeepDSL =>
  implicit class ArrayBufferRep[A](self: Rep[ArrayBuffer[A]])(implicit typeA: TypeRep[A]) {
    def size: Rep[Int] = arrayBufferSize[A](self)(typeA)
    def apply(i: Rep[Int]): Rep[A] = arrayBufferApply[A](self, i)(typeA)
    def update(i: Rep[Int], x: Rep[A]): Rep[Unit] = arrayBufferUpdate[A](self, i, x)(typeA)
    def indexWhere(p: Rep[(A => Boolean)]): Rep[Int] = arrayBufferIndexWhere[A](self, p)(typeA)
    def clear(): Rep[Unit] = arrayBufferClear[A](self)(typeA)
    def minBy[B](f: Rep[(A => B)])(implicit typeB: TypeRep[B], cmp: Ordering[B]): Rep[A] = arrayBufferMinBy[A, B](self, f)(typeA, typeB, cmp)
    def foldLeft[B](z: Rep[B])(op: Rep[((B, A) => B)])(implicit typeB: TypeRep[B]): Rep[B] = arrayBufferFoldLeft[A, B](self, z, op)(typeA, typeB)
    def append(elem: Rep[A]): Rep[Unit] = arrayBufferAppend[A](self, elem)(typeA)
    def remove(n: Rep[Int]): Rep[A] = arrayBufferRemove[A](self, n)(typeA)
    def isEmpty: Rep[Boolean] = arrayBufferIsEmpty[A](self)(typeA)
    def initialSize: Rep[Int] = arrayBuffer_Field_InitialSize[A](self)(typeA)
  }
  object ArrayBuffer {
    def apply[T]()(implicit typeT: TypeRep[T]): Rep[ArrayBuffer[T]] = arrayBufferApplyObject[T]()(typeT)
  }
  // constructors
  def __newArrayBuffer[A](initialSize: Rep[Int])(implicit overload1: Overloaded1, typeA: TypeRep[A]): Rep[ArrayBuffer[A]] = arrayBufferNew1[A](initialSize)(typeA)
  def __newArrayBuffer[A]()(implicit overload2: Overloaded2, typeA: TypeRep[A]): Rep[ArrayBuffer[A]] = arrayBufferNew2[A]()(typeA)
  // case classes
  case class ArrayBufferNew1[A](initialSize: Rep[Int])(implicit val typeA: TypeRep[A]) extends ConstructorDef[ArrayBuffer[A]](List(typeA), "ArrayBuffer", List(List(initialSize))) {
    override def curriedConstructor = (copy[A] _)
  }

  case class ArrayBufferNew2[A]()(implicit val typeA: TypeRep[A]) extends ConstructorDef[ArrayBuffer[A]](List(typeA), "ArrayBuffer", List(List())) {
    override def curriedConstructor = (x: Any) => copy[A]()
  }

  case class ArrayBufferSize[A](self: Rep[ArrayBuffer[A]])(implicit val typeA: TypeRep[A]) extends FunctionDef[Int](Some(self), "size", List()) {
    override def curriedConstructor = (copy[A] _)
  }

  case class ArrayBufferApply[A](self: Rep[ArrayBuffer[A]], i: Rep[Int])(implicit val typeA: TypeRep[A]) extends FunctionDef[A](Some(self), "apply", List(List(i))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class ArrayBufferUpdate[A](self: Rep[ArrayBuffer[A]], i: Rep[Int], x: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[Unit](Some(self), "update", List(List(i, x))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class ArrayBufferIndexWhere[A](self: Rep[ArrayBuffer[A]], p: Rep[((A) => Boolean)])(implicit val typeA: TypeRep[A]) extends FunctionDef[Int](Some(self), "indexWhere", List(List(p))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class ArrayBufferClear[A](self: Rep[ArrayBuffer[A]])(implicit val typeA: TypeRep[A]) extends FunctionDef[Unit](Some(self), "clear", List(List())) {
    override def curriedConstructor = (copy[A] _)
  }

  case class ArrayBufferMinBy[A, B](self: Rep[ArrayBuffer[A]], f: Rep[((A) => B)])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B], val cmp: Ordering[B]) extends FunctionDef[A](Some(self), "minBy", List(List(f))) {
    override def curriedConstructor = (copy[A, B] _).curried
  }

  case class ArrayBufferFoldLeft[A, B](self: Rep[ArrayBuffer[A]], z: Rep[B], op: Rep[((B, A) => B)])(implicit val typeA: TypeRep[A], val typeB: TypeRep[B]) extends FunctionDef[B](Some(self), "foldLeft", List(List(z), List(op))) {
    override def curriedConstructor = (copy[A, B] _).curried
  }

  case class ArrayBufferAppend[A](self: Rep[ArrayBuffer[A]], elem: Rep[A])(implicit val typeA: TypeRep[A]) extends FunctionDef[Unit](Some(self), "append", List(List(elem))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class ArrayBufferRemove[A](self: Rep[ArrayBuffer[A]], n: Rep[Int])(implicit val typeA: TypeRep[A]) extends FunctionDef[A](Some(self), "remove", List(List(n))) {
    override def curriedConstructor = (copy[A] _).curried
  }

  case class ArrayBufferIsEmpty[A](self: Rep[ArrayBuffer[A]])(implicit val typeA: TypeRep[A]) extends FunctionDef[Boolean](Some(self), "isEmpty", List()) {
    override def curriedConstructor = (copy[A] _)
  }

  case class ArrayBuffer_Field_InitialSize[A](self: Rep[ArrayBuffer[A]])(implicit val typeA: TypeRep[A]) extends FieldDef[Int](self, "initialSize") {
    override def curriedConstructor = (copy[A] _)
    override def isPure = true

  }

  case class ArrayBufferApplyObject[T]()(implicit val typeT: TypeRep[T]) extends FunctionDef[ArrayBuffer[T]](None, "ArrayBuffer.apply", List(List())) {
    override def curriedConstructor = (x: Any) => copy[T]()
  }

  // method definitions
  def arrayBufferNew1[A](initialSize: Rep[Int])(implicit typeA: TypeRep[A]): Rep[ArrayBuffer[A]] = ArrayBufferNew1[A](initialSize)
  def arrayBufferNew2[A]()(implicit typeA: TypeRep[A]): Rep[ArrayBuffer[A]] = ArrayBufferNew2[A]()
  def arrayBufferSize[A](self: Rep[ArrayBuffer[A]])(implicit typeA: TypeRep[A]): Rep[Int] = ArrayBufferSize[A](self)
  def arrayBufferApply[A](self: Rep[ArrayBuffer[A]], i: Rep[Int])(implicit typeA: TypeRep[A]): Rep[A] = ArrayBufferApply[A](self, i)
  def arrayBufferUpdate[A](self: Rep[ArrayBuffer[A]], i: Rep[Int], x: Rep[A])(implicit typeA: TypeRep[A]): Rep[Unit] = ArrayBufferUpdate[A](self, i, x)
  def arrayBufferIndexWhere[A](self: Rep[ArrayBuffer[A]], p: Rep[((A) => Boolean)])(implicit typeA: TypeRep[A]): Rep[Int] = ArrayBufferIndexWhere[A](self, p)
  def arrayBufferClear[A](self: Rep[ArrayBuffer[A]])(implicit typeA: TypeRep[A]): Rep[Unit] = ArrayBufferClear[A](self)
  def arrayBufferMinBy[A, B](self: Rep[ArrayBuffer[A]], f: Rep[((A) => B)])(implicit typeA: TypeRep[A], typeB: TypeRep[B], cmp: Ordering[B]): Rep[A] = ArrayBufferMinBy[A, B](self, f)
  def arrayBufferFoldLeft[A, B](self: Rep[ArrayBuffer[A]], z: Rep[B], op: Rep[((B, A) => B)])(implicit typeA: TypeRep[A], typeB: TypeRep[B]): Rep[B] = ArrayBufferFoldLeft[A, B](self, z, op)
  def arrayBufferAppend[A](self: Rep[ArrayBuffer[A]], elem: Rep[A])(implicit typeA: TypeRep[A]): Rep[Unit] = ArrayBufferAppend[A](self, elem)
  def arrayBufferRemove[A](self: Rep[ArrayBuffer[A]], n: Rep[Int])(implicit typeA: TypeRep[A]): Rep[A] = ArrayBufferRemove[A](self, n)
  def arrayBufferIsEmpty[A](self: Rep[ArrayBuffer[A]])(implicit typeA: TypeRep[A]): Rep[Boolean] = ArrayBufferIsEmpty[A](self)
  def arrayBuffer_Field_InitialSize[A](self: Rep[ArrayBuffer[A]])(implicit typeA: TypeRep[A]): Rep[Int] = ArrayBuffer_Field_InitialSize[A](self)
  def arrayBufferApplyObject[T]()(implicit typeT: TypeRep[T]): Rep[ArrayBuffer[T]] = ArrayBufferApplyObject[T]()
  type ArrayBuffer[A] = scala.collection.mutable.ArrayBuffer[A]
  case class ArrayBufferType[A](typeA: TypeRep[A]) extends TypeRep[ArrayBuffer[A]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = ArrayBufferType(newArguments(0).asInstanceOf[TypeRep[_]])
    private implicit val tagA = typeA.typeTag
    val name = s"ArrayBuffer[${typeA.name}]"
    val typeArguments = List(typeA)

    val typeTag = scala.reflect.runtime.universe.typeTag[ArrayBuffer[A]]
  }
  implicit def typeArrayBuffer[A: TypeRep] = ArrayBufferType(implicitly[TypeRep[A]])
}
trait ArrayBufferImplicits { this: ArrayBufferComponent =>
  // Add implicit conversions here!
}
trait ArrayBufferImplementations { self: DeepDSL =>

}
trait ArrayBufferComponent extends ArrayBufferOps with ArrayBufferImplicits { self: DeepDSL => }

trait NextContainerOps extends Base { this: DeepDSL =>
  implicit class NextContainerRep[T](self: Rep[NextContainer[T]])(implicit typeT: TypeRep[T]) {
    def next_=(x$1: Rep[NextContainer[T]]): Rep[Unit] = nextContainer_Field_Next_$eq[T](self, x$1)(typeT)
    def next: Rep[NextContainer[T]] = nextContainer_Field_Next[T](self)(typeT)
    def current: Rep[T] = nextContainer_Field_Current[T](self)(typeT)
  }
  object NextContainer {

  }
  // constructors
  def __newNextContainer[T](current: Rep[T], next: Rep[NextContainer[T]])(implicit typeT: TypeRep[T]): Rep[NextContainer[T]] = nextContainerNew[T](current, next)(typeT)
  // case classes
  case class NextContainerNew[T](current: Rep[T], next: Rep[NextContainer[T]])(implicit val typeT: TypeRep[T]) extends ConstructorDef[NextContainer[T]](List(typeT), "NextContainer", List(List(current, next))) {
    override def curriedConstructor = (copy[T] _).curried
  }

  case class NextContainer_Field_Next_$eq[T](self: Rep[NextContainer[T]], x$1: Rep[NextContainer[T]])(implicit val typeT: TypeRep[T]) extends FieldSetter[NextContainer[T]](self, "next", x$1) {
    override def curriedConstructor = (copy[T] _).curried
  }

  case class NextContainer_Field_Next[T](self: Rep[NextContainer[T]])(implicit val typeT: TypeRep[T]) extends FieldGetter[NextContainer[T]](self, "next") {
    override def curriedConstructor = (copy[T] _)
  }

  case class NextContainer_Field_Current[T](self: Rep[NextContainer[T]])(implicit val typeT: TypeRep[T]) extends FieldDef[T](self, "current") {
    override def curriedConstructor = (copy[T] _)
    override def isPure = true

  }

  // method definitions
  def nextContainerNew[T](current: Rep[T], next: Rep[NextContainer[T]])(implicit typeT: TypeRep[T]): Rep[NextContainer[T]] = NextContainerNew[T](current, next)
  def nextContainer_Field_Next_$eq[T](self: Rep[NextContainer[T]], x$1: Rep[NextContainer[T]])(implicit typeT: TypeRep[T]): Rep[Unit] = NextContainer_Field_Next_$eq[T](self, x$1)
  def nextContainer_Field_Next[T](self: Rep[NextContainer[T]])(implicit typeT: TypeRep[T]): Rep[NextContainer[T]] = NextContainer_Field_Next[T](self)
  def nextContainer_Field_Current[T](self: Rep[NextContainer[T]])(implicit typeT: TypeRep[T]): Rep[T] = NextContainer_Field_Current[T](self)
  type NextContainer[T] = ch.epfl.data.legobase.NextContainer[T]
  case class NextContainerType[T](typeT: TypeRep[T]) extends TypeRep[NextContainer[T]] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = NextContainerType(newArguments(0).asInstanceOf[TypeRep[_]])
    private implicit val tagT = typeT.typeTag
    val name = s"NextContainer[${typeT.name}]"
    val typeArguments = List(typeT)

    val typeTag = scala.reflect.runtime.universe.typeTag[NextContainer[T]]
  }
  implicit def typeNextContainer[T: TypeRep] = NextContainerType(implicitly[TypeRep[T]])
}
trait NextContainerImplicits { this: NextContainerComponent =>
  // Add implicit conversions here!
}
trait NextContainerImplementations { self: DeepDSL =>

}
trait NextContainerComponent extends NextContainerOps with NextContainerImplicits { self: DeepDSL => }

trait RangeOps extends Base { this: DeepDSL =>
  implicit class RangeRep(self: Rep[Range]) {
    def foreach[U](f: Rep[(Int => U)])(implicit typeU: TypeRep[U]): Rep[Unit] = rangeForeach[U](self, f)(typeU)
    def step: Rep[Int] = range_Field_Step(self)
    def end: Rep[Int] = range_Field_End(self)
    def start: Rep[Int] = range_Field_Start(self)
  }
  object Range {

  }
  // constructors
  def __newRange(start: Rep[Int], end: Rep[Int], step: Rep[Int]): Rep[Range] = rangeNew(start, end, step)
  // case classes
  case class RangeNew(start: Rep[Int], end: Rep[Int], step: Rep[Int]) extends ConstructorDef[Range](List(), "Range", List(List(start, end, step))) {
    override def curriedConstructor = (copy _).curried
  }

  case class RangeForeach[U](self: Rep[Range], f: Rep[((Int) => U)])(implicit val typeU: TypeRep[U]) extends FunctionDef[Unit](Some(self), "foreach", List(List(f))) {
    override def curriedConstructor = (copy[U] _).curried
  }

  case class Range_Field_Step(self: Rep[Range]) extends FieldDef[Int](self, "step") {
    override def curriedConstructor = (copy _)
    override def isPure = true

  }

  case class Range_Field_End(self: Rep[Range]) extends FieldDef[Int](self, "end") {
    override def curriedConstructor = (copy _)
    override def isPure = true

  }

  case class Range_Field_Start(self: Rep[Range]) extends FieldDef[Int](self, "start") {
    override def curriedConstructor = (copy _)
    override def isPure = true

  }

  // method definitions
  def rangeNew(start: Rep[Int], end: Rep[Int], step: Rep[Int]): Rep[Range] = RangeNew(start, end, step)
  def rangeForeach[U](self: Rep[Range], f: Rep[((Int) => U)])(implicit typeU: TypeRep[U]): Rep[Unit] = RangeForeach[U](self, f)
  def range_Field_Step(self: Rep[Range]): Rep[Int] = Range_Field_Step(self)
  def range_Field_End(self: Rep[Range]): Rep[Int] = Range_Field_End(self)
  def range_Field_Start(self: Rep[Range]): Rep[Int] = Range_Field_Start(self)
  type Range = scala.collection.immutable.Range
  case object RangeType extends TypeRep[Range] {
    def rebuild(newArguments: TypeRep[_]*): TypeRep[_] = RangeType
    val name = "Range"
    val typeArguments = Nil

    val typeTag = scala.reflect.runtime.universe.typeTag[Range]
  }
  implicit val typeRange = RangeType
}
trait RangeImplicits { this: RangeComponent =>
  // Add implicit conversions here!
}
trait RangeImplementations { self: DeepDSL =>

}
trait RangeComponent extends RangeOps with RangeImplicits { self: DeepDSL => }

