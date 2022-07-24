package Scala.RecursiveFunctions

import java.util.concurrent.RecursiveTask

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

  //foo_iterative(params){
  //    header
  //    while(condition){
  //        loop_body
  //    }
  //    return tail
  //}


 // RecursiveTask

  //oo_recursive(params){
  //    header
  //    return foo_recursion(params, header_vars)
  //}
  //
  //foo_recursion(params, header_vars){
  //    if(!condition){
  //        return tail
  //    }
  //
  //    loop_body
  //    return foo_recursion(params, modified_header_vars)
  //}

  

}
