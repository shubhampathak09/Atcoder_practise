#include<bits/stdc++.h>
using namespace std;


f(int i,int j1,int j2,int n,int m,vector<vector<int>>grid){
	
	// bounday cases
	
	if(j1<0 || j1 >=m || j2 <0 || j2>=m)
	return -1e8;
	
	
	if(i==n-1){
		
		if(j1==j2){
			return grid[i][j1];
		}else
		return grid[i][j1] + grid[i][j2];
		
	}
	
	int maxi=0;
	
	for(int k1=-1;k1<=1;k1++){
		
		for(int k2=-1;k2<=1 ;k2++){
			
			//cout<< k1 << " "<< k2;
			
			int value = 0;
			cout<< j1 << " "<<j2;
			if(j1 == j2){
				value = grid[i][j1];
			}else
			value = grid[i][j1] + grid[i][j2];
			cout<<j1+k1 << " "<< j2 + k2;
			value += f(i,j1 + k1,j2 +k2,n,m,grid);
			maxi =max(maxi,value);
		}
	}
	return maxi;
}

int main(){
	
	vector<vector<int>>grid= {{0,1,-1},{1,0,-1},{1,1,1}};
	int n=grid.size();
	int m=grid[0].size();
	
	int maxChoclatesCollected= f(0,0,m-1,n,m,grid);
	
	
}
