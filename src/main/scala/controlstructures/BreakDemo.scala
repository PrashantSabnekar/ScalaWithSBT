package controlstructures

import util.control.Breaks._

object BreakDemo {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      breakable {
        if (i == 5) break
        println(i)
      }
    }
  }
}
