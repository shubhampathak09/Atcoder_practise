#include<bits/stdc++.h>
using namespace std;


void solve(int n, int s,int d,int h, int &count)
{
	if(n==1)
	{
		count=count+1;
		return;
	}
	solve(n-1,s,h,d,count);
	count++;
	solve(n-1,h,d,s,count);
	
}

int main(){
	
	int count=0;
	solve(6,1,3,2,count);
	cout<<"tower of brahama for 6 rods :- "<<count;
	
	
}
