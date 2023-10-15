// microsoft 
#include<bits/stdc++.h>
using namespace std;

int knapSack(int wt[],int va[],int w,int n){
	
	if(n==0 || w==0){
		return 0;
	}
	
	if(wt[n-1]<=w){
		return max(val[n-1]+kansack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1));
		
	}
	else if(wt[n-1]>w){
		return knapsack(wt,val,w,n-1);
	}
}


int knapack(int wt[],int va[],int w,int n){
	
	int dp[n+1][n+1];
	for(int i=0;i<=n;i++){
		for(int j=0;j<=n;j++){
			if(i==0 || j==0){
				dp[i][j]=0;
			}
			else{
				
				if(wt[i-1]<=j){
				dp[i][j] = max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);	
				}
				else
				dp[i][j]=dp[i-1][j];
			}
		}
	}
	return dp[n+1][n+1];
}

int main(){
	
	
	
}
