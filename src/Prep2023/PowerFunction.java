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

        int xnm1= power(x,n-1);
        int xn= x * xnm1;
        return xn;
    }
}
