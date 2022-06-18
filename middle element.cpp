// runner techniqu

// mid of linked list


#include<bits/stdc++.h>
using namespace std;

struct node
{
	int data;
	struct node*next;
	node(int data){
		this->data=data;
		this->next=NULL;
	}
};


int findMiddle(struct node*node){
	
	struct node*slow=node;
	struct node*fast=node;
	struct node*prev;
	
	while(fast && fast->next){
		
		prev=slow;
		slow=slow->next;
		fast=fast->next->next;
		
		
	}
	
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
	node1->next->next->next->next->next->next->next=new node(8);
	
	
	cout<<findMiddle(node1);	
	
}
