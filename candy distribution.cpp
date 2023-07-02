#include<bits/stdc++.h>
using namespace std;


int ans = INT_MAX;

void solve(int start,vector<int>nums,vector<int>&v,int k)
{
	if(start == nums.size()){
		int maxi =INT_MIN;
		for(int i=0;i<k;i++){
			maxi =max(maxi,v[i]);
		}
		ans=min(ans,maxi);
	}
	
	
	for(int i =0;i<k;i++){
		v[i]+=nums[start];
		solve(start+1,nums,v,k);
		v[i]-=nums[start];
		
		if(v[i]==0){
			
		}
		
	}
	
}
int main(){
	

	vector<int>nums={8,15,10,20,8};

    int n =nums.size();
    
    int k=2;
    
	vector<int> v(k,0);
	
	
	solve(0,nums,v,2);
	
	cout<<ans;
}
