package Scala.FunctionCalls

object CBNvsCBV extends App{

  def calledByValue(x:Long):Unit={
    println("by Value "+ x)
    println("by Value "+ x)
    println("by Value "+ x)
    println("by Value "+ x)
  }
  def calledByName(x: => Long):Unit ={
    println("by Name "+ x)
    println("by Name "+ x)
    println("by Name "+ x)
    println("by Name "+ x)
  }
  // time functions return long  in scala jvm

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite() :Int = 1 + infinite()
  def printFirst(x:Int,y: => Int) =println(x)

 // printFirst(infinite(),38)
  printFirst(38,infinite())  // lazy streams


}
