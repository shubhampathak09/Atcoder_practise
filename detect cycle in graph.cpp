#include<bits/stdc++.h>
using namespace std;



bool isCyclic(int V,vector<vector<int>>adj){
	vector<int> inDegree(V,0);
	queue<int>q;
	int visited =0;
	
	for(int u=0;u<V;u++){
		for(auto x : adj[u]){
			inDegree[x]++;
		}
	}
	
	
	for(int x=0;x<V;x++){
		if(inDegree[x]==0){
			q.push(x);
		}
	}
	
	
	
	while(!q.empty()){
		int u=q.front();
		q.pop();
		visited++;
		//visited++;
		for(auto x : adj[u]){
			inDegree[x]--;
			if(inDegree[x]==0)
			q.push(x);
		}
		
	}
	return visited !=V;
}


void addEdge(int u,int v,vector<vector<int>>g){
	g[u].push_back(v);
	
}

//0 -> 1


int main(){
	
	vector<vector<int>>g(1000);
	
	addEdge(0,1,g);
	addEdge(0,2,g);
	addEdge(1,3,g);
	addEdge(4,1,g);
	addEdge(4,5,g);
	addEdge(5,3,g);
	
	bool cycle=isCyclic(6,g);
	
	
	if(cycle){
		cout<<"Cycle Exisits";
	}else
	cout<<"Cycle Does not Exisits";
	
}
