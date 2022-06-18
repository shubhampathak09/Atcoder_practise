// stock span 


#include<bits/stdc++.h>
using namespace std;

int main(){
	
	vector<int>  inp ={100,80,60,70,60,75,85};
	
	vector<int> ngeL(inp.size());
	
	int n=inp.size();
	
	ngeL[0]=1;
	
	stack<int> s;
	
	s.push(0);
	
	for(int i=1;i<n;i++){
		
		while(!s.empty() && inp[i]>inp[s.top()]){
			
			s.pop();
			
		}
		
		if(s.empty()){
			ngeL[i]=i+1;
		}else
		{
		ngeL[i]=i - s.top();	
		}
		s.push(i);
	}
	
	
	for(int i=0;i<ngeL.size();i++){
		
		cout<<ngeL[i]<<" ";
		
	}
	
}

