package baseclasses

class Animal {
  protected def walk = println("Animal walks")
  protected def hunt = println("Animal hunts")
}

class Tiger extends Animal {
  def f() = {
    super.walk
    super.hunt
  }
}

object C extends App {
  val v = new Tiger
  v.f()
}