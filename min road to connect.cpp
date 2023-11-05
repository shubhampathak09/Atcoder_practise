// 

#include<bits/stdc++.h>
using namespace std;

void dfs(int i){
	if(vis[i]==false){
		vis[i]=true;
		for(auto x : g[i]){
			if(vis[x]==false)
			dfs(x);
		}
	}
}


void connectComp(){
	int n,m;
	int cc=0;
	vector<vector<int>>g;
	vector<bool>vis;
	vector<int>lead;
	
	for(int i=1;i<=n;i++){
		if(vis[i]==false){
			dfs(i);
			cc++;
			lead.push_back(i);
		}
	}
	cout<<cc-1;
	
	
}

int main(){
	
	
}
