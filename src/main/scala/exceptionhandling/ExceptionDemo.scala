package exceptionhandling

class ExceptionDemo(val x:Int, val y : Int) {

  def divide() : Int = {
    if(y ==0) throw new Exception("Zero divisor")
    x / y
  }

}

object ExceptionDemo {

  def main(args: Array[String]): Unit = {
    val obj = new ExceptionDemo(10,0)
    var result = 0
    try {
      result = obj.divide()
    } catch {
        case e: Exception => println("Exception occured " + e.getMessage)
    }


    println(result)
  }
}