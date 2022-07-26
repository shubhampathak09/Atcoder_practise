package Scala.RecursiveFunctions

import java.util.concurrent.RecursiveTask
import scala.collection.mutable

object Day2  extends  App{

  // General way to conver for loop and while loop to recursion in scala

  // for (int i=0;i<100;i++) sum+=i  // sum =0

  def doSum(n:Int) :Int ={
    def doSumUtil(x :Int,res:Int) :Int = if(x==0)res
    else
      doSumUtil(x-1,x+res);
    doSumUtil(n,0);
  }

// mutable collections can updated and extendded in place
  //add change or remove the elements of a collection as a side effect
  // mutabl collection are IndexedSeq[T],
  // root collection and immutable collection
  // collection  -> immutable or mutable
  // collection.mutable.Set or collection.mutable.Iterable
  // collection.mutable  collection.generic
  // root collection scala.collection interface mutable and non mutable
  // general idea Line recursive vs tail recursive

  //foo_iterative(params){
  //    header
  //    while(condition){
  //        loop_body
  //    }
  //    return tail
  //}

// Traversable, Iterable,Seq,IndexedSeq,Iterator,Stream,Vector,StringBuilder
  //Range
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
