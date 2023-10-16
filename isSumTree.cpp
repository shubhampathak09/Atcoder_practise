#include<bits/stdc++.h>
using namespace std;


struct node{
	
	int data;
	struct node*left;
	struct node*right;
	node(int data){
		this->data=data;
		this->letf=null;
		this->right=null;
	}
};


int isSumTree(struct node*root){
	
	int ls,rs;
	
	if(root ==NULL || root->left == null && root->right==null){
		return 1;
	}
	
	ls = sum(root->left);
	rs = sum(root->right);
	
	
	return isSumTree(root->left) && isSumTree(root->right) && node->data ==ls+rs;
	



}

int sum(struct node*root){
	
	if(root==NULL)
	return 0;
	
	return leftsum = sum(root->left) +sum(root->right) +root->data;
	
	
	
}




int main(){
	
	
	
}
