#include<bits/stdc++.h>
using namespace std;

int main(){
	
	int k =4;
	
	
	map<node*, node *> par  ->  child parent
	
	preorder(node*curr , node*par){
		if(root ==null){
			return
		}
		
		par[curr]=par;
		preorder(root->left,cur);
		preorder(root->right,cur);
		
	}
	
	
	preorder   -> map
	
	
	q.push(target);
	
	set<node*> visited;
	
	
	while(!q.empty && k > 0){
		
		k-=1;
		int size =q.size();
		
		for(int i =0 ;i< size;i++){
		node curr =q.front();
		q.pop();
		visited.insert(curr);
		
		if(set.contains(curr->left)==set.end()) q.push(curr->left);
		if(set.contains(cuur->right)==set.end())q.push(curr->right);
		if(set.contains(parent[curr])==set.end())q.push(parent[curr])
		
			
		}
		
		vector<int> ans;
		
		while(!q.empty()){
			ans.push_back(q.front());
			q.pop();
		}
		// print ans
	}
	
	//https://github.com/hemansnation
	
	
}
