package Prep2023;

public class ClimbStairs {

    public static int count(int n){
        if(n==0 || n==1)
            return 1;

        /**
         * From ith th staricase can make 1 or 2 jumps **/

        int left=count(n-1);

        int right=count(n-2);

        return left+right;
    }


    public static void main(String[] args){


        System.out.println(count(3));

    }
}
