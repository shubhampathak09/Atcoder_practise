/*
// linked list

template<typename T>

class Node
{
	T data;
	Node<T> *next;
	
	
	public:
		Node(T data){
			this->data=data;
			next=NULL;
		}
	
}


Node<int> *n =new Node<int>(10);


*/



#include<bits/stdc++.h>
using namespace std;


class node{
public:
	int data;
	node* next;

	node(int data){
		this->data = data;
		next = NULL;
	}
};


bool isPresent(node * head, int key){
    //Complete this function 
    
    
    
 node *temp=head;
 
 while(temp!=NULL){
 	
 	if(temp->data==key)
 	return true;
 	
 	temp=temp->next;
 	
 }   
    
    
}
