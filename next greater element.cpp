// nge to right

#include<bits/stdc++.h>
using namespace std;




int main(){
	
vector<int>  inp={4,5,2,25};

int n=inp.size();
	
vector<int> nge(n);

stack<int>s;

s.push(inp[n-1]);

nge[n-1]=-1;

for(int i=n-2;i>=0;i--){
	
	while(!s.empty() && inp[i]>s.top()){
		
		s.pop();
		
	}
	
	
	if(s.empty()){
		nge[i]=-1;
	}else
	{
		nge[i]=s.top();
	}
	
	s.push(inp[i]);
}

for(int i=0;i<n;i++){
	cout<<nge[i]<<" ";
	
}	

}

