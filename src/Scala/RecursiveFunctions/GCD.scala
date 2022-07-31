package Scala.RecursiveFunctions

object GCD extends App {

  def gcd(n:Int ,m:Int) :Int ={
    if(m==0)
      n
    else
    gcd(m,n%m)

  }
  print(gcd(18,16))

}
