#include<bits/stdc++.h>
using namespace std;


void bfs(vector<vector<int>> & adjList,int startNode,vector<bool> &visited){
	
	
	queue<int>q;
	
	
	visited[startNode] = true;
	
	q.push(startNode);
	
	while(!q.empty()){
		
		int currentNode = q.front();
		q.pop();
		cout<<currentNode << " ";
		
		for(int x : adjList[currentNode]){
			if(!visited[x]){
				visited[x] = true;
				q.push(x);
			}
		}
		
	}
	
}




int main(){
	
	
	int vertices =5;
	
	vector<vector<int>> adjList(vertices);
	
	adjList[0].push_back(1);
	adjList[1].push_back(0);
	
	adjList[1].push_back(3);
	adjList[3].push_back(1);
	
	adjList[1].push_back(4);
	adjList[4].push_back(1);
	
	adjList[2].push_back(4);
	adjList[4].push_back(2);
	
	
	vector<bool> visited(vertices, false);
	
	cout<<"bfs starting from vertex 0 ";
	
	
	bfs(adjList,0,visited);
	
	
}
