package monoid

trait Monoid[A] {
  def op(a1 : A, a2 : A) : A
  def zero: A
}


class MonoidDemo extends Monoid[String]{
  override def op(a1: String, a2: String): String = a1 + a2
  override def zero: String = ""
}

object MonoidDemo {

  def main(args: Array[String]): Unit = {
    val sm = new MonoidDemo
    val res = sm.op("One", "Two")
    println(res)
  }

}

