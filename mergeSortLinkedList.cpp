// merge sort

#include<bits/stdc++.h>
using namespace std;


node* midPoint(node *head){
	
	node*slow=head;
	node*fast=head;
	
	while(fast!=NULL && fast->next!=NULL){
		fast=fast->next->next;
		slow=slow->next->next;
	}
	return slow;
	
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


node *mergeSort(node*head){
	
	if(head==NULL || head->next==NULL)
	return head;
	
	node*mid=midPoint(head);
	
	node* a=head;
	node* b=mid->next;
	mid->next=NULL;
	
	a=megeSort(a);
	b=mergeSort(b);
	
	return merge(a,b);
	
}

int main(){
	
	
}
