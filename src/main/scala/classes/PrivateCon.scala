package classes

class PrivateCon private (id : Int) {

  println("This is a private constructor")

}

object PrivateCon {
  val instance = new PrivateCon(100)
  def getInstance() = {
    instance
  }

}

object PTest extends App {

  val p = PrivateCon.getInstance




}