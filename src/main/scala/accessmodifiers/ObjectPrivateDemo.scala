package accessmodifiers

class ObjectPrivateDemo {

  private [this] def objectPrivateFunction = println("This function is object private function")
  private def privateFunction = println("This is a private function")

  def demo(otherInstance : ObjectPrivateDemo) = {
    println("object private access")
    // this will not compile as we are trying to access object private function from instance other than this
    //otherInstance.objectPrivateFunction
    objectPrivateFunction
    otherInstance.privateFunction
  }
}

object Test extends App {

  val someObject = new ObjectPrivateDemo
  someObject.demo(someObject)

}