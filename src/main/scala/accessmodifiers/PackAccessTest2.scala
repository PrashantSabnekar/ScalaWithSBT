package accessmodifiers

import accessmodifiers.packone.PackageAccessDemo

class PackAccessTest2 {

  def check() = {
    val v = new PackageAccessDemo
    v.packageAccess
  }
}

object B extends App {
  val v1 = new PackAccessTest2
  v1.check()
}