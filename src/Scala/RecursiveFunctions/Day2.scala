package Scala.RecursiveFunctions

object Day2  extends  App{

  // General way to conver for loop and while loop to recursion in scala

  // for (int i=0;i<100;i++) sum+=i  // sum =0

  def doSum(n:Int) :Int ={
    def doSumUtil(x :Int,res:Int) :Int = if(x==0)res
    else
      doSumUtil(x-1,x+res);
    doSumUtil(n,0);
  }


  // general idea Line recursive vs tail recursive

}
