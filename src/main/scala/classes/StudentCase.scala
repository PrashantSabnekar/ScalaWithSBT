package classes

case class StudentCase(rollNo : Int, name : String, standard : String) {

  def display(): Unit = {
    println(s"RollNo: $rollNo Name: $name Standard: $standard")
  }

}

object StudentCase {
  def apply() = new StudentCase(0, "No Name", "Not Available")
  def apply(rollNo : Int) = new StudentCase(rollNo, "No Name", "Not Available")
}

object CaseTest extends App {

  val s1 = StudentCase(1, "Prashant", "First")
  s1.display()

  val s2 = StudentCase()
  s2.display()

  val s3 = StudentCase(100)
  s3.display()



}