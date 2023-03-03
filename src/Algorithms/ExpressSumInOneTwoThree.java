package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ExpressSumInOneTwoThree {

    public static int count2(int n, ArrayList<Integer> ar){
        int[] dp=new int[n+1];
        dp[0]=1;
        int k=ar.size();
        for(int i=0;i<k;i++){
            for(int j=1;j<=n;j++){
                if( j >=ar.get(i)){
                    dp[j]+=dp[j-ar.get(i)];
                }
            }
        }
        return dp[n];
    }

    public static int count(int n){

        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                if(j >= i){
                    dp[j]+=dp[j-i];
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args){
        System.out.println(count(10));
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(4);
        System.out.println(count2(5,li));
    }
}
