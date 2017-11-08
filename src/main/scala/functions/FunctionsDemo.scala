package functions

class FunctionsDemo {

  val lessThan = new Function2[Int, Int, Boolean] {
    def apply(a: Int, b: Int) =  a < b
  }

  def partial1[A,B,C] (a : A, f:(A,B) => C) : B => C = (b:B) => f(a,b)

  def curry[A,B,C] (f: (A,B) => C) : A=> (B => C) = (a : A) => (b: B) => f(a,b)

  def unCurry[A,B,C] (f: A=> B=> C) : (A,B) => C = (a: A, b: B) => f(a)(b)

  def compose[A,B,C] (f: B => C, g: A => B) : A => C = (a : A) => f(g(a))
}


object FunctionsDemo {

  def main(args: Array[String]): Unit = {
    val obj = new FunctionsDemo
    val res = obj.lessThan(100, 200)

    println(res)
  }
}
