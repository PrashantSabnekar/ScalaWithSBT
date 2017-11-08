package functions

class Factorial {

  def abs(n : Int) : Int = {
    if (n < 0) -n
    else n
  }

  private def formatAbs(n : Int) = {
    val msg = "The absolute value of %d is %d."
    msg.format(n, abs(n))
  }

  def factorial(n : Int) = {
    @annotation.tailrec
    def go(acc : Int, n : Int): Int = {
      if (n <= 0) acc
      else go(acc * n, n-1)
    }
    go(1, n)
  }

}

object Factorial {
  def main(args: Array[String]): Unit = {

    val f = new Factorial
    println(f.factorial(5))

    println(f.formatAbs(100))
  }
}