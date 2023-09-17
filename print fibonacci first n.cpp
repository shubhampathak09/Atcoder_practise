#include<bits/stdc++.h>
using namespace std;


void printFib(int n){
	
	
	int a =0 ;int b=1;
	
	cout<<a<<endl;
	 
	for(int i=1;i<n;i++){
		cout<<b<<endl;
		int next = a + b;
		a=b;
		b=next
	}
	
}

int main(){
	
	
	printFib(7);
}
