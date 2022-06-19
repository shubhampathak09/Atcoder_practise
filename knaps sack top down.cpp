// knapsakc top dow

#include<bits/stdc++.h>
using namespace std;


int solve(int val[],int wt[],int n,int w){
	
	
	int t[n+1][w+1];
	
	for(int i=0;i<=n;i++){
		for(int j=0;j<=w;j++){
			
			if(i==0 || j==0){
				t[i][j]=0;
			}
			else if(wt[i-1]<=j){
				t[i][j]=max(t[i-1][j], val[i-1]+t[i-1][j-wt[i-1]]);
			}
			else
			t[i][j]=t[i-1][j];	
			}
		}
		return t[n][w];
	}
	
	


int main(){
	
	
		int val[]={60,100,120};
	int weight[]={10,20,30};
	int w=50;
	
	int n=sizeof(val)/sizeof(val[0]);
	
	int ans=solve(val,weight,n,w);
	
	cout<<ans;
	
}
