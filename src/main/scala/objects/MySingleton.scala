package objects

object MySingleton {

  private [this] var resource : Resource = _


  def getInstance : Resource = {
    if(resource == null) {
      resource = new Resource("Kafka")
    }
    println("Resource is open now")
    resource
  }

  def close = {
    println("Resource is closed now")
  }

}

class Resource(val name : String) {
  def getDriverInfo: Unit = {
    println(s"The driver info is as follows ...\nDriver Name: $name")
  }
}

object Singletontest extends App {
  val resource = MySingleton.getInstance
  resource.getDriverInfo

}