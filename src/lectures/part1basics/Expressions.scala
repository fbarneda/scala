package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // this is an EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... side effects
  println(aVariable)

  // Instructions (Doing something) (Computer DO -- print a variable,  print console, do this do that) Imperative language like Python or Java
  // vs
  // Expressions (SCALA) (have a VALUE and/or a TYPE) (every single bit will compute a VALUE)

  // IF EXPRESSION in SCALA, different than in other languages:
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  val aWhile = while (i < 0){
    println(i)
    i +=1
  }
  // NEVER WRITE THIS AGAIN. THIS IS IMPERATIVE CODE (Python, Java, C)

  // EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVariable = 3) // Unit === void // Unit will always return ()
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {

    val y = 2
    val z = y +1

    if (z > 2) "Hello" else "Goodbye" // LAST VALUE = result

  }

  println(aCodeBlock)

}
