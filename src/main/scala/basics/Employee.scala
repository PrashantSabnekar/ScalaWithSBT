package basics

class Employee(val id : Int, val name : String, val department : String) {

  private var x : Int = 0

  def this() {
    this(0, "NA", "NA")
  }

  def this(id : Int) {
    this(id, "NA", "NA")
  }

  def this(id : Int, name : String) {
    this(id, name, "NA")
  }

  def display() : Unit = {
    println("Id: " + id + "\tName: " + name + "\tDepartment: " + department)
  }

  def switchTest(x : Int)  = {

    x match{
      case 1 => println("One")
      case 2 => println("Two")
    }
  }

}


object Junk {
  def main(args: Array[String]): Unit = {
    val e1 = new Employee(101, "Prasahnt", "IT")
    e1.display()

    val e2 = new Employee()
    e2.display()

    e2.switchTest(1)

  }
}

object Employee {

  def main(args: Array[String]): Unit = {
    val e2 = new Employee(102, "OPafas", "IT")

    e2.display()

    println("x = " + e2.x )
  }
}