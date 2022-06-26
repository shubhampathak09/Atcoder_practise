package Scala



object LastElementOfLisy extends App {

  val myList : List[Int] =List(1,2,3,4,5,6,7)
  val y = myList.last;

  println("The Last element of list is.."+y)
//
//  for(element <- myList.last)
//    {
//      print(element)
//    }

     myList.foreach{x:Int => print(x+" ")}

  println(myList.last);
  // get second last element



}
