#include<bits/stdc++.h>
using namespace std;
// count x total shapes

int dx[]={1,0,-1,0};
int dy[]={0,1,0,-1};

void dfs(int i,int j,vector<vector<char>>&grid,int n,int m){
	grid[i][j]='o';
	for(int k=0;k<4;k++){
		int newi=i +dx[k];
		int newj=j+dy[k];
		if(newi >=0 && newi<n && newj>=0 && newj<m && grid[newi][newj]=='x'){
		 
		dfs(newi,newj,grid,n,m);	
		}
	}
	return;
}


int main(){

vector<vector<char>> grid= {{'x','o','x'},{'o','x','o'},{'x','x','x'}};

int n=grid.size();
int m=grid[0].size();
 

int count =0;

for(int i =0 ;i<n;i++){
	for(int j=0;j<m;j++){
		if(grid[i][j]=='x'){
			//cout<<i<<" "<<j<<endl;
			dfs(i,j,grid,n,m);
			count++;
		}
	}
}
	cout<<"total number of x in grid is:- "<<count<<endl;
	return 0;
	
}
