package functions

class Strings {

  def findFirst(a : Array[String], s : String) : Int = {

    println(a.length)
    @annotation.tailrec
    def loop(n : Int): Int = {
      if (n >= a.length) -1
      else if (a(n).equals(s)) n
      else loop(n+1)
    }

    loop(0)
  }

}


object Strings {

  def main(args: Array[String]): Unit = {
    val s = new Strings
    val arr = Array("One", "Two", "Three")
    println(s.findFirst(arr, "One"))
    println(s.findFirst(arr, "Three"))

  }
}
