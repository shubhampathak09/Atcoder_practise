// generate abbreviation

#include<bits/stdc++.h>
using namespace std;


void gen(string s,string ans,int count,int pos)

{
	
	if(pos==s.length()){
		if(count==0)
		cout<<ans<<endl;
		else
		{
		cout<<ans+to_string(count)<<endl;	
		}
		return;
	}
	
	if(count>0)
	gen(s,ans+to_string(count)+s[pos],0,pos+1);
	else
	gen(s,ans+s[pos],0,pos+1);
	
	gen(s,ans,count+1,pos+1);
	
	
}

int main(){
	
	string s="word";
	string ans="";
	int count =0;
	
	gen(s,ans,count,0);
	
	
}
