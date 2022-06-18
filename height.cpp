// height of tree 

#include<bits/stdc++.h>
using namespace std;

struct node
{
	int data;
	struct node*left;
	struct node*right;
	node(int data){
		this -> data=data;
		this->left=NULL;
		this->right=NULL;
	}
};


int height(struct node*root){
	
	if(root==NULL)
	return 0;
	
	return max(root->left,root->right) +1;
	
	
}


int main(){
	

// not going to test this out lol!
	
}
