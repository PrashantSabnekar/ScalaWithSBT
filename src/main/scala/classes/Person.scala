package classes

class Person(protected var name : String, var age : Int) {

  println("Person class primary constructor begins")

  def this(){
    this("NoName", 0)
  }

  private val JavaHome = System.getProperty("JAVA_HOME")

  override def toString = s"The person $name is $age years old"

  def printJavaHome: Unit = {
    println(s"JavaHome = $JavaHome")
  }

  def printName: Unit = {
    println(this)
  }

  def setName(name : String) = {
    this.name = name
  }

  printJavaHome

  printName

  println("Still in the primary constructor")

}

object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("Prashant", 25)

    //p1.name = "Prashant Sabnekar"
    p1.setName("Prashant Sabnekar ...")
    p1.printName

   // val p2 = new Person()
  }
}

class AccessTest(id : Int) {
  def display() = {
    println("id = " + id)
  }
}

object newTest extends App {

  println("hello")

  val x = 123
  println(x + x)

  val o1 = new AccessTest(100)
  o1.display()

}