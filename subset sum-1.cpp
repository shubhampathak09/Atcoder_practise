// types of knapsack

// subset sum 

// eyal pair parition

// count of subset sum

// min sum sum diff

// target sum


// subset sum

#include<bits/stdc++.h>
using namspace std;


bool subsetSum(int arr,int n,int target){
	
	if(n==0)
	return false;
	
	if(target == 0)
	return true;
	
	if(arr[n-1]<=target){
		return subsetSum(arr,n-1,target-arr[n-1]) || subsetSum(arr,n-1,target);
		
	}else if(target > arr[n-1])
	 subsetSum(arr,n-1,target);
		
	return
	
}



bool subsetSumTop(int arr,int n,int target){
	int t[n+1][target+1];
	
	for(int i=0;i<=target;i++)
	t[0][i] =false;
	
	for(int i=0;i<=n;i++){
		t[i][0]=true;
	}
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(arr[i-1]<=j){
				t[i][j] = t[i-1][j-arr[i-1]] ||t[i-1][j];
			}else
			t[i][j]=t[i-1][j];
		}
	}
	return t[n][target];
}

int main(){
	
	int arr[]={2,3,7,8,10};
	
	int n= sizeof(arr)/sizeof(arr[0]);
	
	int tar =11;
	
	
	
	
}
