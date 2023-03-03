package Algorithms;

public class ExpressSumInOneTwoThree {

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
    }
}
