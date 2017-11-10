import java.time.LocalDateTime

val ch : Char = 112
ch

val dateTime = LocalDateTime.now()

val x = 10
x.toFloat
x.toDouble
x.toString

val a = 0.1
val b = 0.2
val c = a + b
0.3 == c

def ~=(x : Double, y: Double, precision : Double) = {
  if((x-y) < precision)
    true
  else
    false
}

~=(0.3, c, 0.00001)


123456789 < Double.NegativeInfinity
12345 > Double.PositiveInfinity






