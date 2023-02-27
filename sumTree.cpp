#include<bits/stdc++.h>
using namespace std;

struct node{
	int data;
	struct node*left;
	struct node*right;
	node(int data){
		this->data=data;
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
struct node*root=new node(10);
root->left=new node(-2);
root->right=new node(6);
root->left->left=new node(8);
root->left->right=new node(-4);
root->right->left=new node(7);
root->right->right=new node(5);

cout<<"Inital.."<<endl;

inorder(root);

cout<<endl;

toSumTree(root);

cout<<"After Tree is converted to Sum Tree.."<<endl;

inorder(root);	

cout<<endl;
}
