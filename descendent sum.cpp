// replace with descendant sum

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



int replaceWithSum(node *node){
	
	if(node==NULL)
	return 0;
	
	if(node->left==NULL && node->right==NULL)
	return node->data;
	
	int  temp=node->data;
	
	node->data=replaceWithSum(node->left) + replaceWithSum(node->right);
	
	return temp+node->data;
	
}

int main(){
	
struct node*root=new node(1);

root->left=new node(2);

root->right=new node(3);

root->left->left=new node(4);

root->left->right=new node(5);

root->right->right=new node(6);

root->left->right->left=new node(7);	
	
	
} 
