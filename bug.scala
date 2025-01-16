```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // This will throw an exception because map is not defined for Int
  val doubledList = list.map(x => x.map(_ * 2))

  println(doubledList)
}
```