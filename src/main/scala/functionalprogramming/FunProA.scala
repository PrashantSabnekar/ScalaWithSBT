package functionalprogramming

class FunProA {

  def f1() = println("Simple function takes no argument and returns nothing")

  def addTwoIntegers(x : Int, y: Int) : Int = x + y

  def f5(fun:() => Unit) = {
    fun()
  }

  def f6(x : Int, y : Int, fun:(Int, Int) => Int) = {
    val res = fun(x,y)
    println(s"Adding two numbers $x and $y, result = $res")
    res
  }

  def execueAndPrint(x : Int, y : Int, f:(Int, Int) => Int) = {
    println(f(x,y))
  }
}


object B extends App {

  val v = new FunProA

  def a(x : Int, y: Int) : Int = x + y

  v.f6(1,2,a)
  v.f6(12,12, (x: Int, y: Int) => x + y + 100)

  val sum = (x : Int, y: Int) => x + y
  val product = (x : Int, y : Int) => x * y

  v.execueAndPrint(5,10, sum)
  v.execueAndPrint(5,10, product)


}