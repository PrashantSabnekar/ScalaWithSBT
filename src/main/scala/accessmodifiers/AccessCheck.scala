package accessmodifiers

class AccessCheck {

  // normal private member variable
  private var total = 0

  //object-private member variable
  private[this] var otherTotal = 0

  def add(n : Int) : Unit = {
    total += n
    otherTotal += n
  }

  def copyFrom(otherInstance : AccessCheck) : Unit = {
    total += otherInstance.total
    //otherTotal += otherInstance.otherTotal
  }

  def display : Unit = {
    println(" total = " + total)
    println(" other total = " + otherTotal)
  }
}

object AccessCheck {

  def main(args: Array[String]): Unit = {

    val accessCheck1 = new AccessCheck
    accessCheck1.add(100)
    accessCheck1.display

    val accessCheck2 = new AccessCheck
    accessCheck2.copyFrom(accessCheck1)
    accessCheck2.display

  }
}