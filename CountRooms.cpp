// count rooms

#include<bits/stdc++.h>
using namespace std;

int n,m;
vector<vector<bool>>vis;
vector<pair<int,int>>moves = {{-1,0},{1,0},{0,-1},{0,1}};

int room;

bool isValid(int x,int y){
	if(x< 0 || x >=n || y<0 || y>=m){
		return false;
	}
	return true;
}

void dfs(int i,int j){
	
	vis[i][j] = true;
	
	for(auto p : moves){
		if(isValid(i+p.first,j+p.second)){
			dfs(i+p.first,j+p.second);
		}
	}
}

void connectComponents(){
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			dfs(i,j);
			rooms++;
		}
	}
}

int main()
{
	room=0;
	connectComponents();
	
	
	
	}
