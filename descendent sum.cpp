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
	
	
	
} 
