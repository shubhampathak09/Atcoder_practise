package Scala

object Expressions extends App {

  val x=1+2 // expresssions
  println(x)

  println(2 + 3 * 4)

  // +  - * /  ^ | & << >> >>> right shift with zero extension

  println(1==x)
  println(!(1==x))
  var aVariable = 2
  aVariable+=3  // side effects
  println(aVariable)

    // instructions(do) vs expressions(value or type)

   val aCondition=true
   val aConditionValue=if(aCondition) 5 else 3 // if expression
  println(aConditionValue)

  println(if(aCondition) 5 else 3)

  // loops are discuraged

  // no side effects please

  var i=0;
  val aWhile=while(i<10){
    println(i)
    i+=1
  }
  // pls never write this pls.....pls....


  // everhing in scala is an expression

  val aWeirdValue= (aVariable = 3) // Unit
  println(aWeirdValue)


  // code blocks


  val aCodeBlock={
    val y=2
    val z=y+1
    if(z>1)"hell0" else "good bye"
  }


  // differnece between "hello world" and println("Hello worls")
  //uimt vs string


   val someValue={
     2<3  //1
   }
   println(someValue)
  val someOtherValue= {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)


  // value of code block is the last executed expressions

  
}
