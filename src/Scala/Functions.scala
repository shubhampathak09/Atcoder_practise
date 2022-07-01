package Scala

object Functions extends App {

  def aFunction (a:String,b:Int) : String = {
    a + " " + b

  }

  println(aFunction("Hello",3))

  def aParameterList() : Int =42

  println(aParameterList())

  println(aParameterList)

  // using functions as loop

  def aRepeatedFunction(aString:String,n:Int):String={
    if(n==1)
      aString
      else
      aString + aRepeatedFunction(aString,n-1)
    }

  println(aRepeatedFunction("hello",4))

  // when you need loops use recursion


  def aFunctionWithSideEffect(aString : String):Unit={
    println(aString)
  }
  def aBigFunction(n:Int) :Int ={
    def aSmallerFunction(a:Int,b:Int):Int =a+b

    aSmallerFunction(n,n-1)
  }


  // task 1 -> a greeting function for kids
  //function(name,age) =? hi my name is ..and I am age yrs old


  def aGreetingFunction(name: String,age:Int) ={
    "Hi, my name is "+name +" and I am " +age+" years old."
  }
  println(aGreetingFunction("Mike",12))

  // Factorial Function

  def Factorial(value:Int):Int ={
    if(value==1)
      1
    else
      value * Factorial(value-1)
  }

  // Fibonacci Function

  def Fibonacci(value : Int):Int ={
    if(value==1)
      1
    else if(value==2)
      1
    else
      Fibonacci(value-1) + Fibonacci(value-2)
  }



  println(Factorial(5))

  println(Fibonacci(3))


  def checkPrime(a:Int):Boolean ={
    def isPrimeUntil(t:Int):Boolean =
      if(t<=1) return true
      else isPrimeUntil(t-1) && a%t!=0

    isPrimeUntil(a/2)
  }

  println(checkPrime(5))
}
