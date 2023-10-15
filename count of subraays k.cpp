#include<bits/stdc++.h>
using namespace std;

int main(){
	
	int arr[] ={10,2,-2,-20,10};
	int t =-10;
	int csum=0;
	int result=0;
	map<int,int>lookup;
	int n=sizeof(arr)/sizeof(arr[0]);
	for(int i =0;i<n;i++){
		csum+=arr[i];
		
		
		if(csum==t){
			result++;
		}
		
		
		if(lookup.find(csum-t)!=lookup.end()){
			result+=lookup[csum-t];
		}
		lookup[csum]++;
	}
	
	cout<<result;
}
