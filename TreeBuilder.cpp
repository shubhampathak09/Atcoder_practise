// tree builder boiler plate

#include<bits/stdc++.h>
using namespace std;


struct node
{
	int data;
	struct node*left;
	struct node*right;;
	node(int data){
		this->data=data;
		this->left=NULL;
		this->right=NULL;
	}
};


node *buildTree(){
	
	int d;
	cin>>d;
	
	if(d==-1)
	return NULL;
	
	
	node* n= new node(d);
	n->left=buildTree();
	n->right=buildTree();
	
}

void inorder(node *root){
	
	if(root==NULL)
	return;
	
	inorder(root->left);
	
	cout<<root->data<<" ";
	
	inorder(root->right);
	
}

int main(){
	
	
	node *root=buildTree();
	
    cout<<"printing inorder"<<endl;
	
	inorder(root);	
	
}

/*
1
2
-1
-1
3
-1
-1
*/
