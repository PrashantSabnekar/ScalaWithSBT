package exceptionhandling

class ExceptionDemo(val x:Int, val y : Int) {

  def divide() : Int = {
    if(y ==0) throw new Exception("Zero divisor")
    x / y
  }

  def addTwoIntegers(x : Int, y : Int) : Int = {
    x match{
      case x : Int => println(s" x = $x")
      case x : Any => throw new IllegalArgumentException("Please pass any integer")
    }

    y match {
      case y : Int => println(s" y = $y")
      case y : Any => throw new IllegalArgumentException("Please pass any integer")
    }

    x + y
  }

}

object ExceptionDemo {

  def main(args: Array[String]): Unit = {
    val obj = new ExceptionDemo(10,0)

    val x = 10
    val y = 20
    val xplusy = obj.addTwoIntegers(x,y)
    println(" result = " + xplusy)

    var result = 0
    try {
      result = obj.divide()
    } catch {
        case e: Exception => println("Exception occured " + e.getMessage)
    }
    println(result)
  }
}