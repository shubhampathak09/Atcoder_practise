package Algorithms;

public class AddFractions {

    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else if(b==a)
            return 1;
        else if(b>a)
            return gcd(b,a);
        else
            return gcd(b,a%b);
    }
    public static void lowest(int num,int den){
        int gcd1=gcd(num,den);
    }

    public static void main(String[] args){
     //   System.out.println(gcd(252,63));
    }
}
