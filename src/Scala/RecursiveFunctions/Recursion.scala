package Scala.RecursiveFunctions

import scala.jdk.Accumulator

object Recursion extends App {

  val x=2


  def factorial(n:Int) :Int = {
    if(n<=1)
      1
    else {
      println("computing the factorial of "+ n + " - I need the factorial of "+(n-1))
      val result=n*factorial(n-1)
      println("Computing the result of "+n)
      result

    }

  }
  println(factorial(10))

  def anotherFactorial(n:Int) :Int ={
    def factHelper(x :Int,accumulator: Int):Int =
      if (x<=1)
        accumulator
      else
        factHelper(x-1,x*accumulator)

     factHelper(n,1)

  }

  //  10  -> 10,1  -9 ,10     9,10     8,10 *9 .. and so one

}

