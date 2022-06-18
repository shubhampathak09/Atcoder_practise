// target sum equals x

#include<bits/stdc++.h>
using namespace std;


int countSubsets(vector<int>arr,int n,int i,int x){
	
	
	if(i==n){
		
		if(x==0){
			return 1;
		}else
		return 0;
		
	}
	
	int inc=countSubsets(arr,n,i+1,x-arr[i]);
	int exc=countSubsets(arr,n,i+1,x);
	
	return inc+exc;
	
}




int main(){
	
	
	vector<int> arr={1,2,3,4,5};
	int n=arr.size();
	int i=0;
	int x=6;
	
	cout<<countSubsets(arr,n,i,x);
	
	
	
	
}
