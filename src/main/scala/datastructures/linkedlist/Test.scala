package datastructures.linkedlist

object Test {

  def main(args: Array[String]): Unit = {
    val node1 : List[Int] = Nil
    val node2 : List[Int] = Cons(1, Nil)
    val node3 : List[Int] = Cons(3, Cons(2, Cons(1, Nil)))
    val node4 : List[Double] = Cons(3, Cons(2, Cons(1, Nil)))

    println(node3.toString)
    println(List.sum(node3))
    println(List.product(node4))

  }

}
