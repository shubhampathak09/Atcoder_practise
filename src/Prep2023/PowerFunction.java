package Prep2023;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        int y= sc.nextInt();
        int xn=power(x,y);
        System.out.println(xn);
    }
    public  static int power(int x,int n){


        if(n==0)
            return 1;

        int xnm1= logPower(x,n-1);
        int xn= x * xnm1;
        return xn;
    }


    // logarithmic approach

    public static int logPower(int x, int n){
        // if x (n/2) * x(n/2)  if n is even
        // odd x *x(n-1/2) * x(n-1/2)
        if(n==0)
            return 1;

        int xeven = logPower(x,n/2);
        int xn= xeven * xeven;

        if(n % 2 == 1){
            xn = x * xn;
        }
        return xn;
    }

}
