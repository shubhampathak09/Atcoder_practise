
#include<bits/stdc++.h>
using namespace std;


class node{
	int key;
	int val;
	
	node*next;
	node*prev;
	
	node(int _key,int _val){
		key = _key;
		val = _val;
	}
};


node*head = new node(-1,-1);
node*tail = new node(-1,-1);

int cap;
unordered_map<int,node*>m;

void init(int capacity){
	cap = capacity;
	head->next = tail;
	tail->prev=head;
}

void addNode(node*newNode){
	node*temp= head->next;
	newNode->next=temp;
	newNode->prev=head;
	head->next=newNode;
}

void deleteNode(node*deleteNode){
	node*delPrev=deleteNode->prev;
	node*delNext=deleteNode->next;
	delPrev->next=delNext;
	delNext->prev=delPrev;
}

int get(int key_){
	if(m.find(key_)!=m.end()){
		node*existingNode = m[key_];
		int res=existingNode->value;
		m.erase(key_);
		deleteNode(existingNode);
		addNode(existingNode);
		m[key_]=head->next;
		return res;
	}
	return -1;
}



void put(int key_,int value){
	if(m.find(key_)!=m.end()){
		node* existingNode= m[key_];
		m.erase(existingNode);
		deletenode(existingNode);
	}
	if(m.size()==cap){
		m.erase(tail->prev->key);
		deleteNode(tail->prev);
	}
	addNode(new Node(key_,value));
	m[key_]=head->next;
}

int main(){
	
}
