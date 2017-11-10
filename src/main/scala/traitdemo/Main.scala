package traitdemo

object Main {

  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    println(tiger.hunt)
    tiger.common
  }
}
