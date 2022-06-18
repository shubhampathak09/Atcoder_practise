// max selement in window size of k

#include<bits/stdc++.h>
using namespace std;


int main(){
	
	
	stack<int> s;
	
	vector<int>arr={1};
	
	vector<int> nge(arr.size());
	
	s.push(arr.size()-1);
	
	
	nge[arr.size()-1]=arr.size();
	
	int n=arr.size();
	
	for(int i=n-2;i>=0;i--){
		
		
		while(!s.empty() && arr[i]>= arr[s.top()])
		{
			s.pop();
		}
		
		if(s.empty())
		{
			nge[i]=arr.size();
		}else
		{
			nge[i]=s.top();
		}
		s.push(i);
	}
	
}
