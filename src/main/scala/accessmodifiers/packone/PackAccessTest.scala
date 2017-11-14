package accessmodifiers.packone

class PackAccessTest {

  def letsc() = {
    val v = new PackageAccessDemo
    v.packageAccess
  }

}

object A extends App {

  val p1 = new PackAccessTest
  p1.letsc()

}