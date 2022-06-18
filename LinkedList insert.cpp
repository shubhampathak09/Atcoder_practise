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



//work --Linked List



void insertAtHead(node*&head,int data){
	
	if(head==NULL){
		
		head=new node(data);
		return;
	}
	
	
	//create a new node
	
	node* n=new node(data);
	n->next=head;
	head=n;
}

	
void printLL(node *head){
	while(head!=NULL){
		cout<<head->data<<" ";
		head=head->next;
	}
	cout<<endl;
}	

int main(){

	
node *head=NULL;

	     insertAtHead(head,4);
		insertAtHead(head,3);
		insertAtHead(head,2);
		insertAtHead(head,1);
		insertAtHead(head,0);
	
	printLL(head);
}
