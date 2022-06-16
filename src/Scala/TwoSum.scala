package Scala

import scala.util.control.Breaks.break

object  TwoSum extends App {

  var target : Int =13
  var nums: Array[Int]=Array(2,7,11,15);
  var result : Array[Int]=Array(-1,-1);

  for( i <- 0 to nums.length-1){

    var x=nums(i);

    for( j <- i +1 to nums.length)
      {
        var y=nums(j);
         def findSum: Unit = {
           if(x+y==target){
             result(0)=x;
             result(1)=y;
             return;
           }
         }
      }
  }

  for( i <- 0 until result.length){
    println(result(i));
  }


}
