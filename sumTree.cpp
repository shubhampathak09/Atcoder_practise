#include<bits/stdc++.h>
using namespace std;

struct node{
	int data;
	struct node*left;
	struct node*right;
	node(int data){
		this->left=NULL;
		this->right=NULL;
	}
};

void inorder(node*root){
	if(root==NULL)
	return;
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}

int toSumTree(node *root){
	
	if(root==NULL)
	return 0;
	
	int old_val=root->data;
	root->data=toSumTree(root->left) + toSumTree(root->right);
	return old_val+root->data;
	
}

int main(){
	
}
