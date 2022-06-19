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


void kreverse(node*head,int k){
	
	if(head==NULL)
	return NULL;
	
	
	node*curr=head;
	node*prev=NULL;
	node*temp;
	
	int cnt=1;
//	int sz=getsize(head);
	
//	
//	if(k>sz){
//		return head;
//	}
	
	while(curr !=NULL && cnt<=k){
		
		temp=curr->next;
		curr->next=prev;
		prev=curr;
		curr=temp;
		
	}
	
	if(temp!=NULL){
		head->next=kreverse(temp,k);
	}
	
	return prev;
}

void iterativeReverse(node*head){
	
	
	node*prev=NULL;
	node*curr=head;
	node*temp;
	
	while(curr!=NULL){
		
		temp=curr->next;
		
		curr->next=prev;
		
		prev-=curr;
		
		curr=temp;
		
	}
	
	head=prev;
	
	return head;
}

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


node *recReverse(node*head){
	
	
	if(head==NULL ||head->next==NULL)
	{
	   cout<<head->data;
       return head;
}
       
       node* shead=recReverse(head->next);
       
       head->next->next=head;
       
       head->next=NULL;
       
       return shead;
       
  	
}

int main(){

	
node *head=NULL;

	     insertAtHead(head,4);
		insertAtHead(head,3);
		insertAtHead(head,2);
		insertAtHead(head,1);
		insertAtHead(head,0);
	
//	     insertAtMiddle(head,100,3);
	
//	printLL(head);
	
	
	recReverse(head);
	
	cout<<endl;
	
	printLL(head);
}
