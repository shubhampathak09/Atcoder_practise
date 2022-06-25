// falling path sum

#include<bits/stdc++.h>
using namespace std;

int f(int i,int j,vector<vector<int>>v,int n,int m){
	
	
	if(i==n-1){
		return v[n-1][j];
	}
	if(i>=n || j>=m+1 || j<0)
	return 0;
	
	
	int down=v[i][j] + f(i+1,j,v,n,m);
	int  diaR=v[i][j] + f(i+1,j+1,v,n,m);
	int diaL=v[i][j] +f(i+1,j-1,v,n,m);
	return max(max(down,diaR),diaL);
	
	
}

int main(){
	
	vector<vector<int>>v={{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
	int n=v.size();
	int m=v[0].size();
	int ans=INT_MIN;
	for(int i=0;i<m;i++){
		int temp=f(0,i,v,n,m);
		ans=max(ans,temp);
	}
	cout<<ans;
}
