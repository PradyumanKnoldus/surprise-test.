
case class Num(number: String , isEven: Boolean)

object SurpriseTest extends App {

  val listOfNum = List(
    Num("1", isEven = false),
    Num("2", isEven = true),
    Num("3", isEven = false),
    Num("4", isEven = true),
    Num("5", isEven = false)
  )

  // Filter Even Numbers
  private val evenElements = listOfNum.filter(_.isEven)
  println(s"Even Elements are : $evenElements")

  // Filter Odd Numbers
  private val oddElements = listOfNum.filterNot(_.isEven)
  println(s"Odd Elements are : $oddElements")

  // Used Partition Method
  private val (even , odd) = listOfNum.partition(_.isEven)
  println(s"Partitioned Even Elements : $even")
  println(s"Partitioned Odd Elements : $odd")

  // Print only 1st field of the case class for even numbers
  private val firstFieldOnly = evenElements.map(_.number)
  println(s"First Field of the Case Class for Even Numbers : $firstFieldOnly")

}
