package Microsoft;

public class ThreeDivisors {

   public static boolean isPrime(int n){
       if(n==2)
       {
           return true;
       }
       for(int i=2;i<n;i++){
           if(n % i ==0){
               return false;
           }
       }
       return true;
   }

   public static void main(String[] args){
       /** check if a number has exactly three divisors **?
        *
        */


       /**
        *
        * The number must be prime number * prime number and perfect square
        */

       int n=25;

       //double p=Math.sqrt(100);
       double p=Math.sqrt(n);
       if(p * p == (double) n){
           if(isPrime((int)p)){
               System.out.println(n +" has 3 factors exactly");
           }else
           {
               System.out.println(n +" does not have 3 factors exactly");
           }
       }

   }

}
