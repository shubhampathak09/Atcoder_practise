package Algorithms;

public class EuclidDivision {

    static int gcd1(int a,int b){
        int remaining = a % b ;
        if(remaining != 0){
            return gcd1(b,remaining);
        }else{
            return b;
        }
    }

    static int gcd2(int a, int b){

        int x=a;
        int y=b;

        int rem = x % y;

        while(rem!=0){
            x = y;
            y = rem;
            rem= x % y;
        }
        return y;
    }

    public static void main(String [] args){

        int a= gcd1(100,84);

        int b =gcd2(100,84);

        System.out.println("gcd 1 is "+ a);
        System.out.println("gcd 2 is "+b);



    }
}
