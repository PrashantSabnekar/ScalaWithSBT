val list1 = List(1,2,3)

val list2 = list1.map(n => n+1)

val list3 = List("India", "USA", "France", "UK")

val listAll = List(
  list1,
  list2,
  list3
)

val listAllFlattened = listAll.flatten

val x = listAll.flatten.map(n => n.toString.toUpperCase)

val x2 = listAll.flatMap(c => c.map((s => s.toString.toUpperCase)))

val numbers = List(1,2,3,4,5,6,7,8,9,10)
val sum = numbers.foldLeft(0) (
  (acc, nxt) => acc + nxt
)

def contains[A](list : List[A], item : A) = {
  list.foldLeft(false) ((a,b) => a || b == item)
}

contains(list1, 1)
contains(list3, "India")
contains(list3, 1)

15 % 5

List(1,2,3,4,5).map(_ + 10).filter(_ %2 == 0).map(_ * 3)

val randomNumber = new scala.util.Random

randomNumber.nextBoolean()
randomNumber.nextLong()
randomNumber.nextLong()
randomNumber.nextInt(100)
randomNumber.nextInt(100)





