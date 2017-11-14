package accessmodifiers

class ProtectedAccess {
  protected def data = println("protected data")
}

class ProtectedData extends ProtectedAccess {

  def demo(): Unit = {
    data
  }
}

object ProtectedObject extends App {

  val obj = new ProtectedAccess
  val obj2 = new ProtectedData
  obj2.demo()
}