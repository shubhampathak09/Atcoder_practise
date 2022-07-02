package Scala.RecursiveFunctions

import scala.annotation.tailrec
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
    @tailrec
    def factHelper(x :Int,accumulator: Int):Int =
      if (x<=1)
        accumulator
      else
        factHelper(x-1,x*accumulator) //TAIL Recursion = use recursive call as last expression

     factHelper(n,1) //

  }

  //  10  -> 10,1  -9 ,10     9,10     8,10 *9 .. and so one

  // when you need loop use tail recusion

  // string concat n times using tail recusrion
  // IsPrime function tail reucrsion
  // fibonnacci rail recrsion


  def stringCon(s:String, n:Int) :String=
    {
      @tailrec
      def stringHelper(s:String,n:Int,result:String):String=
        if(n<1)
          result
        else
          stringHelper(s,n-1,s+result)

     stringHelper("abc",3,"")
    }

    def IsPrime(n :Int) :Boolean =
    {
      def IsPrimeUntil(k:Int) :Boolean=
        if(k<=1)
          true
        else if (n % k==0) false
          else
          IsPrimeUntil(k-1)
        IsPrimeUntil(n-1)
    }

   println(IsPrime(101))


  // fibonacci tail recusrions

  def fib(n:Int) :Int ={
    def fibUtil(n:Int,last:Int,seconLast:Int,result:Int):Int={
      if(n<=2)
        result
      else
        fibUtil(n-1,result,last,last+seconLast)

    }
    fibUtil(n,1,1,1)
  }

  println(fib(8))
}

