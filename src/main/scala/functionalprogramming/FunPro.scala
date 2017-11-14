package functionalprogramming

class FunPro {


  val f1 : (Int) => Boolean = i => {
    i % 2 == 0
  }

  // explicit approach
  val f2 : (Int, Int) => Int = (i, j) => {
    i + j
  }

  //implicit approach
  val f3 = (x : Int, y : Int) => x * y

  def f() : List[Int] = {
    val x1 = List.range(1, 10)
    val evens = x1.filter(_ % 2 == 0)
    evens
  }

  def demo() = {
    println(f())
  }

  demo

  println("Function as a variable  " + f1(10))
  println("Add two integers  " + f2(10,20))

  def f10(fun:() => Unit): Unit = {
    fun()
  }

  f10(demo)

}

object A extends App {
  val v = new FunPro
}