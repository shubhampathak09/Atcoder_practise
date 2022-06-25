// max sum of non adjacet elements
#include<bits/stdc++.h>
using namespace  std;


int  f(int index,vector<int>arr,int n){
	
	if(index==0)
	return arr[index];
	
	if(index-2<0)
	return 0;
	
	
	int include=f(index-2,arr,n) + arr[index];
	int exclude=f(index-1,arr,n);
	
	return max(include,exclude);
	
	
}


int main(){
	
	
	vector<int>arr={1,2,9,4,5,0,4,11,6};
	int n=arr.size();
	
	int ans=f(n-1,arr,n);  //-> o(2 ^n))
	
	cout<<ans;
}
