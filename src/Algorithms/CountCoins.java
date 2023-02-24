package Algorithms;

public class CountCoins {


    /** recursive approach ** /
     *
     * @param coin
     * @param n
     * @param sum
     * @return
     */
    static int count1(int coin[],int n,int sum,int dp[][]){

        if(sum==0)
            return 1;
        if(sum < 0)
            return 0;
        if(n <=0 )
            return 0;

        if(dp[n][sum]!=0)
            return dp[n][sum];

        dp[n][sum]=count1(coin,n-1,sum,dp) +count1(coin,n,sum-coin[n-1],dp);

        return dp[n][sum];
    }

    public static void main(String[] args){
           int coins[] ={1,2,3};
           int n=coins.length;
           int sum=4;
           int [][] dp=new int[n+1][sum+1];
        System.out.println(count1(coins,n,4,dp));
    }

}
