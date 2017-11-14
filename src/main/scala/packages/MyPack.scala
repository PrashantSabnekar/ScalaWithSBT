package packages

import packages.com.prashant.scala.test.MyPack

package com.prashant.scala.test {
  class MyPack {
    override def toString: String = "This is in a package com.prashant.scala.test"
  }
}

object A extends App {
  val v = new MyPack
  println(v.toString)
}

