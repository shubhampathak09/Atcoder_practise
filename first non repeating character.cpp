#include<bits/stdc++.h>
using namespace std;

/*

int main(){
	
string s="aabccbcd";

queue<char>q;

map<char,int>mp;


vector<char>result;

result.push_back(s[0]);

mp[s[0]]=1;

q.push(s[0]);

for(int i=1;i<s.length();i++){
mp[s[i]]++;

auto x=q.front();

if(x==s[i])
{
q.pop();
result.push_back('0');
}
else
{
	if(q.size()==0)
	result.push_back('0');
	else
	result.push_back(x);
	}	
	
}	
	
	for(auto x :result){
		cout<<x<<" ";
	}
}
// fml

*/

int main(){
	
	queue<char> q;
	
	int fre[27]={0};
	
	char ch;
	
	cin>>ch;
	
	while(ch!='.'){
		
		
		q.push(ch);
		fre[ch-'a']++;
		
		while(!q.empty()){
			
			
			int indx=q.front()-'a';
			if(fre[indx]>1)
			q.pop();
		    else
		    {
			
			cout<<q.front()<<endl;
			break;	
		}
		}
		
		if(q.empty()){
			cout<<"-1"<<endl;
		}
		cin>>ch;
	}
	
}
