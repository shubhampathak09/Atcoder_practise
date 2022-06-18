// merge two sorted linked list

// 1 -> 5 -> 7 -> 10 -> NULL

/// 2->3->6-> NULL


#include<bits/stdc++.h>
using namespace std;


struct node
{
	int data;
    node*next;
    node(int data){
    	this->data=data;
    	this->next=NULL;
	}
};


void printnode(struct node*node){
	
	while(node!=NULL){
		cout<<node->data<<" ";
		node=node->next;
	}
	
}

node* merge(node*a,node*b){
	
	if(a==NULL)
	return b;
	
	if(b==NULL)
	return a;
	
	
	node*c;
	
	
	if(a->data>b->data){
		c=b;
		c->next=merge(a,b->next);
	}else
	{
		c=a;
		c->next=merge(a->next,b);
	}
	
	return c;
	
}


int main(){
	
node* a=new node(1);
a->next=new node(2);
a->next->next=new node(4);


node* b=new node(101);
b->next=new node(111);
b->next->next=new node(123);

	
struct node*temp=merge(a,b);

printnode(temp);	
	
}
