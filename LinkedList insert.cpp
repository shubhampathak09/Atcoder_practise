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

void insertAtMiddle(node*head,int data,int pos){
	
	node*temp=head;
	
	for(int i=1;i<=pos-1;i++){
		temp=temp->next;
	}
	
	node*nn=temp->next;
	temp->next=new node(data);
	temp->next->next=nn;
	
}

int main(){

	
node *head=NULL;

	     insertAtHead(head,4);
		insertAtHead(head,3);
		insertAtHead(head,2);
		insertAtHead(head,1);
		insertAtHead(head,0);
	
	     insertAtMiddle(head,100,3);
	
	printLL(head);
}
