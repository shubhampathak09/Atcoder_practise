// knapsack
#include<bits/stdc++.h>
using namespace std;
vector<vector<int>>dp(1001,vector<int>(1001,-1));

int knapsack(int val[] , int wt[],int w,int n){
	
	if(n==0 || w==0)
	return 0;
	
	if(dp[n][w]!=-1)
	return dp[n][w];
 
	if(wt[n-1]<=w){
		return dp[n][w]=max(val[n-1] +knapsack(val,wt,w-wt[n-1],n-1),knapsack(val,wt,w,n-1)); 
	}
	else if(wt[n-1]>w){
		return dp[n][w]=knapsack(val,wt,w,n-1);
	}
	
	
}

int main(){
	
	int val[]={60,100,120};
	int weight[]={10,20,30};
	int w=50;
	
	int n=sizeof(val)/sizeof(val[0]);
	
	int ans=knapsack(val,weight,w,n);
	
	cout<<ans;
}
