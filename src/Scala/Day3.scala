package Scala

import scala.collection.mutable

object Day3 extends App {
  // HashMaps

  var hashMap =new mutable.HashMap[String,String]();

  hashMap.put("K1","v1")
  hashMap+= "k2" -> "V2"
  hashMap("k3")="v3"

  hashMap.foreach{
    case (key,value) => println(key+" -> "  + value)
  }


}
