// subarray partitoning problem

#include<bits/stdc++.h>
using namespace std;


int solve(vector<int>nums,int k,int i,int n,vector<int>dp){
	
	
	if(i==nums.size()){
		return 0;
	}
	if(dp[i]!=-1)
	return dp[i];
	
	//return dp[]
	int maxsum=INT_MIN;
	int mn=INT_MIN;
	int len=0;
	for(int j=i;j<min(i+k,n);j++){
		len++;
		mn=max(mn,nums[j]);
		maxsum=max(mn*len + solve(nums,k,j+1,n,dp),maxsum);
	}
	return dp[i]=maxsum;
}


//1,15,7,9,2,5,10  ->  1,15  7,9,2,5,10  -> 7,9,2 5,10 ->7,9,2   5 10

//1,15,7   ->  9,2,5,10   -> 9 2   5 10


int main(){
	
	
	vector<int> nums={1,15,7,9,2,5,10};
	int n=nums.size();
	vector<int>dp(n,-1);
	int k=3;
	int ans=solve(nums,3,0,n,dp);
	cout<<ans;
}
