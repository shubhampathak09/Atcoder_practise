#include<bits/stdc++.h>
using namespace std;

vector<vector<int>>g;

void bfs(int source,int V){
	queue<int>q;
	bool *visited=new bool[V]{0};
	int *dist =new int[V]{0};
	int *parent =new int[V];
	for(int i=0;i<V;i++){
		parent[i]=-1;
	}
	q.push(source);
	visited[source]=1;
	parent[source]=source;
	dist[source]=0;
	
	while(!q.empty(){
		int f=q.front();
		cout<<f<<endl;
		q.pop();
		for(auto  nbr:l[f]){
			if(!visited[nbr]){
	            parent[nbr]=f;
				dist[nbr]=1+dist[f];		
 				q.push(nbr);
				visited[nbr]=1;
			}
		}
	})
	
	/** print shortest distance from all nodes **/
	
	for(int i=0;i<V;i++){
		cout<<"Shortest distance to node.. "<<i<<" is "<<dist[i]<<endl;
	}
	
}

int main(){
	
	
	
}
