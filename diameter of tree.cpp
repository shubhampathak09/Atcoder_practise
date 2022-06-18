// Diameter of binary tree

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

int height(node*root){

if(root==NULL)
return 0;

int h1=height(root->left);
int h2=height(root->right);

return max(h1,h2)+1;	
	
}


int diameter(node*root){
	
	if(root==NULL)
	return 0;
	
	int d1=height(root->left) + height(root->right);
	
	int d2=max(diameter(root->left),diameter(root->right));
	
	return max(d1,d2);
	
	
	
}

int main(){
	
	struct node*root=new node(1);
	root->left=new node(2);
	root->right=new node(3);
	root->left->left=new node(4);
	root->left->right=new node(5);
	root->left->right->left=new node(7);
	
	root->right->right=new node(6);
	
	
	cout<<diameter(root);
	
}
