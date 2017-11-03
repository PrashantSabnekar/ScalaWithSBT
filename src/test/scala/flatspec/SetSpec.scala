package flatspec

import org.scalatest.FlatSpec

import scala.collection.immutable.Stack

class SetSpec extends FlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "throw NoSuchElementException when an empty stack is popped" in  {
    val emptyStack = new Stack[Int]
    assertThrows[NoSuchElementException] {
      emptyStack.pop
    }
  }



}
