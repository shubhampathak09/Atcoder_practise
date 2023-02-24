package Algorithms;

public class Knapsack {
    static int max(int a,int b){
        return (a > b) ? a : b;
    }

    static int knapSack(int W,int wt[],int val[],int n){
        if(n==0 || W==0 )
            return 0;

        if(wt[n-1]>W){
            return knapSack(W,wt,val,n-1);
        }
        else
            return max(val[n-1]+ knapSack(W-wt[n-1],wt,val,n-1),knapSack(W,wt,val,n-1));
    }

    static int knapSackMem(int W,int wt[],int val[],int n,int [][] dp){
        if(n==0 ||W==0)
            return 0;
        if(dp[n][W]!=-1)
            return dp[n][W];
        if(wt[n-1]>W){
            return dp[n][W]=knapSackMem(W,wt,val,n-1,dp);
        }
        else
            return dp[n][W]= max(val[n-1] + knapSackMem(W-wt[n-1],wt,val,n-1,dp),knapSackMem(W,wt,val,n-1,dp));

    }

    public static void main(String[] args){

        int val[]={60,100,120};
        int wt[]={10,20,30};
        int W=50;
        int n=val.length;
        int[][] dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(knapSack(W,wt,val,n));
        System.out.println(knapSackMem(W,wt,val,n,dp));
    }
}
