// equal sum partition

#include<bits/stdc++.h>
using namespace std;



int solve(int n,int arr[],int sum){
	
	
	int t[n+1][sum+1];
	
	for(int i=0;i<=n;i++){
		t[0][i]=true;
	}
	for(int i=0;i<=sum;i++){
		t[i][0]=false;
		
	}
	
	t[0][0]=true;
	
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=sum;j++){
			if(arr[i-1]<=j){
				t[i][j]=t[i-1][j] || t[i-1][j-arr[i-1]];
			}else
			t[i][j]=t[i-1][j]
		}
	}
	return t[n][sum];
}
int main(){
	
	int arr[]={3,5,3,11};
	
	int s=0;
	int n =sizeof(arr)/sizeof(arr[0]);
	
	for(int i=0;i<n;i++){
		s+=arr[i];
	}
	
	if(s%2!=0){
		cout<<"Not possible";
		return 0;
	}
	
	int sum = s/2;
	
	
	cout<<solve(n,arr,sum);
	
}
