val s = "Hello, world"
s.length

s.foreach(println)
val c : Char = 111
c
s.getBytes.foreach(x => println(x))

val s1 : String = "Hello"
val s2 : String = "Hello"
s1 == s2
val s3 = "Hell"
val s4 = "o"
val s5 = s3 + s4
s1 == s5
s1.equals(s5)

val s6 : String = null
s1 == s6

val name = "Prashant"
val greet = s"Hello $name"
val someFloat : Float = 123.45F
val message = f"value is $someFloat%.4f"

implicit class StringImprovements(val s : String) {
  def repeatStringOnce = s + s
  def palindrome : Boolean = {
    val s1 = s.reverse
     s == s1
  }
}

name.repeatStringOnce




val s10 = "abcba"
val res = s10.palindrome
println(res)



