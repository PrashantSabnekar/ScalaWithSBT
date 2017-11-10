package numbers

class NumbersDemo {


  implicit class StringToInteger(s: String) {
    def toConvertedInt(radix : Int) : Int = {
        Integer.parseInt(s, radix)
    }
  }

  def getConvertedInt(string : String, radix : Int): Int = {

    val o = new StringToInteger(string)
    o.toConvertedInt(radix)

  }


}


object NumbersDemo {
  def main(args: Array[String]): Unit = {
    val s : String = "10"

    val o = new NumbersDemo
    val res = o.getConvertedInt("10", 2)

    println(s + " After conversion is: " + o.getConvertedInt("100", 16)  )

    println(Integer.parseInt("100", 16))
  }
}