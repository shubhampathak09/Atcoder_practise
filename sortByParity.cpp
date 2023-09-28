#include<bits/stdc++.h>
using namespace std;


int main(){
	
	int nums[] = {3,1,2,4};
	int n=sizeof(nums)/sizeof(nums[0]);
    vector<int> out;
	for(int i=0; i<n;i++){
		
		if(nums[i] % 2 == 0){
			out.push_back(nums[i]);
		}
	}
	
	for(int i=0;i<n;i++){
		if(nums[i]%2!=0) 
		{
		out.push_back(nums[i]);	
		}
	}
	for(auto x : out){
		cout<<x<<" ";
		
		
	}
	
	cout<<endl;
}
