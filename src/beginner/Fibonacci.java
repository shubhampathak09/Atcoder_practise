package beginner;

public class Fibonacci {

    public static int Fib(int n , int [] qb){
        if(n == 0 || n ==1)
            return n;

        if(qb[n]!=0)
            return qb[n];

        int fib1=Fib(n-1,qb);
        int fib2=Fib(n-2,qb);
        qb[n]=fib1 +fib2;
        return fib1 + fib2;
    }

    public static void main(String[] args){
      int n=4;
      int fib=Fib(n,new int[n+1]);
        System.out.println("Require val is.."+fib);
    }
}
