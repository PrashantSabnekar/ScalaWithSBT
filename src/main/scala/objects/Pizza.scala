package objects

import classes.Person

class Pizza(val crust : String, val size : Int) {
  override def toString: String = s"Pizza ... Crust = $crust\t Size = $size"
}

object Pizza {
  val THIN_CRUST = "Thin"
  val THICK_CRUST = "Thick"

  val PAN = 1
  val MEDIUM = 2
  val LARGE = 3

  def apply(name : String, size : Int) = {
    val p = new Pizza(name, PAN)
    p
  }
}


object TestPizza extends App {
  val thinPizza = Pizza(Pizza.THIN_CRUST, Pizza.PAN)
  println(thinPizza.toString)

  val thickPizza = new Pizza(Pizza.THICK_CRUST, Pizza.MEDIUM)
  println(thickPizza.toString)
}