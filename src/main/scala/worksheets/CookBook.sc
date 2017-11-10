for(i <- Array(1,2,3,4,5)) println(i)

val ints = Array(1,2,3,4,5,6,7,8,9,10)
for (i <- ints) println(i)
ints

val ints2 = for(i <- ints) yield i + 10
ints
ints2

val ints3 = ints.map(_ + 10)
ints3

val intsUnder5 = ints.filter(_ <= 5)




