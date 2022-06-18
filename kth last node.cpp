// kth elemet  from last

#include<bits/stdc++.h>
using namespace std;

struct node
{
	int data;;
	struct node*next;
	node(int data){
		this->data=data;
		next=NULL;
	}
};

int findNode(struct node*node1,int k){
	
	node*fast=node1;
	node*slow=node1;
	
	for(int i=1;i<=k;i++){
		fast=fast->next;
	}
//	cout<<slow->data<<endl;
//	cout<<fast->data<<endl;
	
	while(fast!=NULL&& fast->next!=NULL){
		 
		fast=fast->next;
		slow=slow->next;
	}
//	cout<<slow->data;
	return slow->data;
}

int main(){

	
	node* node1=new node(1);
	node1->next=new node(2);
	node1->next->next=new node(3);
	node1->next->next->next=new node(4);
	node1->next->next->next->next=new node(5);
	node1->next->next->next->next->next=new node(6);
	node1->next->next->next->next->next->next=new node(7);
	
	cout<<findNode(node1,2);
	
}
