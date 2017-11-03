package funsuite

import org.scalatest.FunSuite

class SetSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("An un initialized List will have size 0") {
    val list = List()
    assert(list.length == 0)
  }
}
