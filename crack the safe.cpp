// cracking the safe

#include<bits/stdc++.h>
using namespace std;


void dfs(string temp,int n,int k,string & ans,set<string>&visited){
	
for(int x=0;x<k;x++){
	
	
	string val=temp+to_string(x);
	//cout<<val;
	if(visited.count(val)==0)
	{
		visited.insert(val);
		
		string node=val.substr(1);
		
		dfs(val,n,k,ans,visited);
		
		ans+=to_string(x);
	}
}	


	
	
}

int main(){
	
	string ans="";
	string temp="";
	
	set<string>visited;
	
	int n=2;
	int k=2;
	
	for(int i=0;i<n-1;i++){
		temp+='0';
	}  // 00000  n=5
	
	cout<<temp;
	dfs(temp,n,k,ans,visited);
	// 
	cout<<ans;
}
