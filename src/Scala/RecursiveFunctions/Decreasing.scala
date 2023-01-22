package Scala.RecursiveFunctions

object Decreasing extends App{

  def printDecreasing(n:Int):Int = {
    if (n == 1) n
    else {
      println(n)
      printDecreasing(n - 1)
    }
  }
  printDecreasing(10)
}
