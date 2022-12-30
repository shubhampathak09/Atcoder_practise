#include<bits/stdc++.h>
using namespace std;
int main(){
	
	string s="f##";
	          
	int idx=0;
	
	for(int i=0;i<s.length();i++){
		if(s[i]!='#'){
			s[idx]=s[i];
			idx++;
		}
		else if(s[i]=='#' && idx >=0){
			idx=idx-1;
		}
		if(idx < 0)
		idx=0;
	}
	cout<<s.substr(0,idx);  //ab
}

// Stream.of(words).collect(Collectors.joininig(" "))
