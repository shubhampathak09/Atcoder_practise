package beginner;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int c=countPaths(n,new int[n+1]);
        System.out.println(c);
    }
    /** 3^m complexity **/
    public static  int countPaths(int n,int [] qb){

        if(n< 0)
            return 0;
        else if(n==0)
            return 1;
        if(qb[n]!=0)
            return qb[n];
        int nx1=countPaths(n-1,qb);
        int nx2=countPaths(n-2,qb);
        int nx3=countPaths(n-3,qb);
        int nx0=nx1 +nx2 +nx3;
        qb[n]=nx0;
        return nx0;
    }
}
