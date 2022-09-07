#include<bits/stdc++.h>
using namespace  std;


string solve(string sentence){
	
	string cw="";
	stack<string>s;
	for(int i=0;i<s.size();i++){
		if(sentence[i]!=' '){
			cw+=sentence[i];
		}else
		{
			s.push(cw);
			cw="";
		}
	}
	
	s.push(cw);
	
	string ress="";
	
	//cout<<s.size();
	//cout<<s.top();
	while(!s.empty()){
		//cout<<s.top();
		ress+=s.top();
		s.pop();
		if(s.size()>1)
		ress+=" ";
	}
	
	return ress;
}

int main(){
	
	string input="How dare thee??";
	
	string out;
	
	out=solve(input);
	
	cout<<out;
	
//	cout<<solve(input);
}
