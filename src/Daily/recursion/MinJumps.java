package Daily.recursion;

import java.util.Scanner;

public class MinJumps {
    public static void main(String[] args){

        int [] nums ={3,2,4,2,0,2,3,1,2,2};

        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int[] arr = new int[n];

        for(int i=0;i< arr.length;i++){
            arr[i]=scn.nextInt();
        }

        Integer[] dp =new Integer[n+1];


        dp[n] =0; // n to n 0 steps

        for(int i =n-1 ;i>=0 ;i--){


            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int j =1 ;j<=arr[i] && i+j<dp.length;j++){
                    if(dp[i+j] != null){
                     min = Math.min(dp[i+j],min);}

                }
                if(min !=Integer.MAX_VALUE){
                    dp[i]=min +1;
                }else{
                    dp[i]=null;
                }
            }

        }

        System.out.println(dp[0]);


    }
}
