package companions

class Employee(val id : Int, val name : String, val salary : Double, val department : String) {

  def details() = {
    println("Id = " + id + " Name: " + name + " salary: " + salary + " department: " + department)
  }
}


object Employee {

  def main(args: Array[String]): Unit = {
    val e1 = new Employee(1, "emp1", 12.34, "IT")
    e1.details()
  }
}
