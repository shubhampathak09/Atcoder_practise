// max selement in window size of k

#include<bits/stdc++.h>
using namespace std;


int main(){
	
	
	stack<int> s;
	
	vector<int>arr={1,2,3,1,4,5,2,3,6};
	
	vector<int> nge(arr.size());
	
	s.push(arr.size()-1);
	
	
	nge[arr.size()-1]=arr.size();
	
	int n=arr.size();
	
	int k=3;
	
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
	
	
	for(int i=0;i<=n-k;i++)
	{
		
		// enter the loop find max of window starts at i
		int j=i;
		
		
		while(nge[j]<i+k)  // indexx  lies withi window
		{
			j=nge[j];
		}
		
		cout<< arr[j]<<" ";
		
	}
	
}
