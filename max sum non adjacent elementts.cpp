// max sum of non adjacet elements
#include<bits/stdc++.h>
using namespace  std;


int  f(int index,vector<int>arr,int n,vector<int>dp){
	
	if(index==0)
	return arr[index];
	
	if(index-2<0)
	return 0;
	
	if(dp[index]!=-1)
	return dp[index];
	
	int include=f(index-2,arr,n,dp) + arr[index];
	int exclude=f(index-1,arr,n,dp);
	
	return dp[index]=max(include,exclude);
	
	
}


int main(){
	
	
	vector<int>arr={1,2,3,1};
	arr.insert(arr.begin()+0,0);
	int n=arr.size();
    
	vector<int>dp(n,-1);
		
	int ans=f(n-1,arr,n,dp);  //-> o(2 ^n))
	
	cout<<ans;
}
