#include<bits/stdc++.h>
using namespace std;


struct node
{
	int data;
	struct node*left;
	struct node*right;
	node(int data){
		this->data=data;;
		this->left=NULL;
		this->right=NULL;
	}
};


void diagonalUtil(node*root,int d,map<int,vector<int>>&diagonalPrint){
	
	if(!root)
	return;
	
	diagonalPrint[d].push_back(root->data);
	
	diagonalUtil(root->left,d+1,diagonalPrint);
	
	diagonalUtil(root->right,d,diagonalPrint);
	
	
	
}


void diagonalPrint(node *root){
	
	map<int,vector<int>> diagonalPrint;
	
	diagonalUtil(root,0,diagonalPrint);
	
	cout<<"Output.."<<endl;
	
	for(auto it: diagonalPrint){
		vector<int> v = it.second;
		
		for(auto x : v){
			cout<<x<<" ";
		}
		cout<<endl;
	}
	
	
}




int main(){
	
	   node* root = new node(1);
        root->left = new node(2);
        root->right = new node(3);
        root->left->left = new node(9);
        root->left->right = new node(6);
        root->right->left = new node(4);
        root->right->right = new node(5);
        root->right->left->right = new node(7);
        root->right->left->left = new node(12);
        root->left->right->left = new node(11);
        root->left->left->right = new node(10);
	
	
	diagonalPrint(root);
	
	
}
