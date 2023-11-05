#include<bits/stdc++.h>
using namespace std;


vector<vector<int>>g;
int n,m;

vector<bool> vis;


//dfs

void dfs(int u){
	
	vis[u]= true;
	
	for(auto x : g[u]){
		if(!vis[u]){
			dfs(v);
		}
	}
	
}

// count connected components

int countConnectedComp(){
	int cc =0;
	
	for(int i=1;i<=n;i++){
		if(!vis[u]){
			dfs(u);
			cc++:
		}
	}
	return cc;
}


// distance from vertex 1 
// sssp


void bfs(int u){
	
	queue<int> bfs_q;
	
	bfs_q.push(u);
	dist[u]=0;
	vis[u]=false;
	
	while(!bfs_q.empty()){
		u = bfs_q.front();
		bfs_q.pop();
		for(auto x : g[u]){
			if(!vis[x]){
				bfs_q.push(u);
				vis[x]=true;
				dis[x] =dis[u] +1;
			}
		}
	}
	
}

int main(){
	
	
	
	
}
