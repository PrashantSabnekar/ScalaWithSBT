package objects

object MyModule {

  def isEven(n : Int): Boolean ={
    require(n != null, "null value")

    if (n%2 == 0) true
    else false
  }

  private def describe() = {
    "This is a private method"
  }

  def main(args: Array[String]): Unit = {
    val res1 = isEven(10)
    val res2 = isEven(15)

    println(res1)
    println(res2)
    println(describe())

  }

}
