package classes

class Base(x : Int, y : Int) {
  def display() = {
    println(s"x = $x y = $y")
  }
}

class Derived(x : Int, y : Int, z : Int) extends Base(x,y) {
  override def display() = {
    println(s"x = $x y = $y z = $z")
  }
}


object TestInheritance extends App {

  val base = new Base(10, 20)
  base.display()

  val derived = new Derived(100, 200, 300)
  derived.display()

}