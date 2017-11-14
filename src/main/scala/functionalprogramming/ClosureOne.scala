package functionalprogramming

class ClosureOne {

  def fn(fun:(String) => Unit, name : String) = {
    fun(name)
  }
}

object X extends App {

  var greet = "Hello ..."

  def closureX(name : String) = println(s"$greet $name")

  val x = new ClosureOne

  var name = "Prashant"
  x.fn(closureX, name)

  name = "Sabnekar"
  greet = "Hola"
  x.fn(closureX, name)
}
