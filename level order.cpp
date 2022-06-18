#include<bits/stdc++.h>
using namespace std;

struct node
{
	
	int data;
	struct node*left;
	struct node*right;
	node(int data){
		this->data=data;
		this->left=NULL;
		this->right=NULL;
	}
};





void levelOrder(node * root){
	
	
	queue<node*> q;
	
	q.push(root);
	
	while(!q.empty()){
		
		int n=q.size();
		
		for(int i=1;i<=n;i++){
			
			auto x=q.front();
			
			q.pop();
			
			cout<<x->data<<" ";
			
			if(x->left){
				q.push(x->left);
			}
			
			if(x->right){
				q.push(x->right);
			}
		}
		cout<<endl;
	}
	
}

int main(){
	
	
struct node*root=new node(1);

root->left=new node(2);

root->right=new node(3);

root->right->right=new node(6);

root->left->left=new node(4);

root->left->right=new node(5);

root->left->right->left=new node(7);

levelOrder(root);


	
}
