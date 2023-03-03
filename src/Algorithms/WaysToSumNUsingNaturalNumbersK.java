package Algorithms;

public class WaysToSumNUsingNaturalNumbersK {

    public static int countWays(int n,int k,int [] dp){
        for(int i=1;i<=k;i++){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    dp[j]+=dp[j-i];
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args){
            int N=8;
            int K=2;
            int [] dp = new int[N+1];
            dp[0]=1;
            int ans=countWays(N,K,dp);
        System.out.println(ans);
    }
}
