/// min subset sum

#include<bits/stdc++.h>
using namespace std;


int subsetSum(int arr[],int n,int sum){
	int t[n+1][sum+1];
	
	for(int i=0;i<=sum;i++)
	t[0][i]=1;
	
	for(int i=0;i<=n;i++)
	t[i][0]=1;
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=sum;j++){
			if(arr[i-1]<=j){
				t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
			}else
			t[i][j]=t[i-1][j];
		}
	}
	return t[n][sum];
	
//	
//	for(int i=0;i<=sum;i++){
//		mn= min(mn,sum - 2 * i)
//	}
//	return mn;
	
}

int minSubsetSum(int arr[],int n,int sum){
	
	int ans=-1;
	
	for(int i=sum;i>0;i--){
		if(subsetSum(arr,n,i)){
			ans=i;
			break
		}
	}
	
	
}







int main(){
	
	
	
}
