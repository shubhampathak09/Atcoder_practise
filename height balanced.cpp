// height balanced subtree
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


pair<int,bool> heightBalanced(struct node*root){
	
	
	pair<int,bool> p;
	
	if(root==NULL)
	{
		p.first=0;
		p.second=true;
		return p;
	}
	
	
	pair<int,bool> left=heightBalanced(root->left);
	pair<int,bool> right=heightBalanced(root->right);
	
	
	p.first=max(left.first,right.first)+1;
	
	if(abs(left.first - right.first)<=1 && left.second==true && right.second==true){
	p.second=true;	
	}else
	p.second=false;
	
	return p;
	
	//lsbt is heeight balanced
	
	// rsbt is height balanced
	
	
	// difference in height of lssbt and rsbt is 1
	
	
	
	
	
}

int main(){
	
	
	
}
