package traitdemo

trait Human {
  def hello = println("the human trait")
}

trait Mother extends Human {
  override def hello = println("Mother")
}

trait Father extends Human {
  override def hello = println("Father")
}

class Child extends Human with Mother with Father {
  def greet = super[Mother].hello
}

object X extends App {
  val v = new Child
  v.greet
}