//Ladders concept

#include<bits/stdc++.h>
using namespace std;


int ladders(int n){
	
	if(n<0)
	return 0;
	
	if(n==0)
    return 1;
		
	 
	
	int from1=ladders(n-1);
	int from2=ladders(n-2);
	int from3=ladders(n-3);
	
	return from1+from2+from3;
	
	
	// this calls can be optimised by dp
	
}

int main(){
	
	cout<<ladders(4);
	
}
