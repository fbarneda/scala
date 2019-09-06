package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b:Int): String = {
    a + ' ' + b
  }

  println(aFunction("Ferran", 29))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, anInt: Int): String = {

    if (anInt == 1) aString
    else aString + " " + anInt + '\n' + aRepeatedFunction(aString, anInt-1)

  }

  println(aRepeatedFunction("Ferran",5))

 // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n:Int):Int = {


  }




}

