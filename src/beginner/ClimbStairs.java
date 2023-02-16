package beginner;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int c=countPaths(n);
    }
    /** 3^m complexity **/
    public static  int countPaths(int n){

        if(n<= 0)
            return 0;
        else if(n==0)
            return 1;

        int nx1=countPaths(n-1);
        int nx2=countPaths(n-2);
        int nx3=countPaths(n-3);
        int nx0=nx1 +nx2 +nx3;
        return nx0;
    }
}
