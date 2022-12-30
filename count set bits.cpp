#include<bits/stdc++.h>
using namespace std;
int main(){
	int n=1234;
	int count=0;
	
	while(n!=0){
	if(n & 1)
	{
		count++;
	}
	n=n/2;
	}
	cout<<count;
}
