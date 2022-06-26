package Scala

import scala.concurrent.Future.never.value

class LinkedList(var data :Int,var next:LinkedList)  {

  def this(data:Int){
    this(data,null);
  }

}

class SingleLL(var head:LinkedList,var tail:LinkedList){
  def this(){
    this(null,null)
  }

  def insert(value  :Int) :Unit ={
    var node:LinkedList = new LinkedList(value)
    if(this.head==null){
      this.head=node
    }else
      {
        this.tail.next=node

      }
    this.tail=node

  }

  def display() :Unit ={
    if(this.head==null)
      {
        println("empty list")
        return
      }
      var temp : LinkedList =this.head

      while (temp!=null){
        print(temp.data+" ")
        temp=temp.next
      }
  }
  def secondLast():Unit ={
    var node :LinkedList =this.head
    if(node==null){
      print("empty linked list");

    }
    else if(node.next==null){
      print("only one element is present")
    }
    else
      {
        while(node.next!=null && node.next.next!=null){
          node=node.next.next
        }
        println("Second last elelemt is: "+node.data)
      }
  }
}



object Main
{
  def main(args:Array[String]):Unit={
 // println("hello")
    var s1:SingleLL =new SingleLL();
    s1.insert(6);
    s1.insert(3);
    s1.insert(2);
    s1.insert(7);
    s1.insert(1);
    s1.insert(9);

    println("Linked List ->")
    s1.display();
    println();
    s1.secondLast();
  }
}
