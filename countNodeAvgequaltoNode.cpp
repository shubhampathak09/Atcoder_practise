#include<bits/stdc++.h>
using namespace std;



int result =0;


struct node
{
	int data;
	node*left;
	node*right;
	
	node(int data){
		this->data = data;
		this->left = NULL;
		this->right = NULL;
	}
};

pair<int,int> getSum(struct node *root){
	
	if(root == NULL){
		return {0,0};
	}
	
	pair<int,int> left = getSum(root->left);
	pair<int,int> right =getSum(root->right);
	
	
	int sum = root->data + left.first + right.first;
	int count = 1 + left.second + right.second;
	
	if(sum / count == root->data){
		result++;
	}
	return {sum,count};
}

int main(){
	
	struct node*root= new node(4);
	root->left = new node(8);
	root->right = new node(5);
	
	root->left->left = new node(0);
	root->left->right =  new node(1);
	
	root->right = new node(5);
	root->right->right = new node(6);
	
	pair<int,int> p = getSum(root);
	
	cout<<result;
	
}
