// Min Path Summ
#include<bits/stdc++.h>
using namespace std;

int solve(vector<vector<int>>grid,int i,int j,int n,int m){
	
	if(i==0 || j== 0)
	{
		return grid[i][j];
	}
	if(i<0 || j<0)
	return INT_MAX;
 
	 
 
	 int up=grid[i][j]+solve(grid,i-1,j,n,m);
	 
	  int left=grid[i][j]+solve(grid,i,j-1,n,m);
	
	return  min(up,left);
	
}

int main(){
	
	vector<vector<int>>grid={{1,3,1},{1,5,1},{4,2,1}};
	
	int n=grid.size();
	int m=grid[0].size();
	
	int minsum=solve(grid,n-1,m-1,n,m);
	
	cout<<minsum;
	
}


//fml
