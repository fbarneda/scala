package lectures.part1basics

object ValuesVariablesTypes extends App {

  // VALS ARE IMMUTABLE
  // COMPILER CAN INFER TYPES

  val x: Int = 42
  println(x)

  //';' ARE ALLOWED BUT ARE NOT NECESSARY, JUST IF YOU WRITE MULTIPLE EXPRESSIONS ON SAME LINE
  val aString: String = "Hello"; val anotherString: String = "Another String"
  println(aString, anotherString)

  // Boolean = true or false
  val aBoolean: Boolean = false

  // Single Characters in single quotes
  val aChar: Char = 'a'

  // Numbers-
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 1111111111111111111L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.1415

  //Variables
  var aVariable: Int = 4
  aVariable = 5 // side effects



}
