// simplify path
#include<bits/stdc++.h>
using namespace  std;


// cd ..  -> parent directoy
// cd stacks -> got to stacks directoy
// cd  ~/Desktop

// / -> Root path
/// /x/y/z


string simplifyPath(string path){
	
	// 1. find all token 
	
   istringstream iss(path);
	
	vector<string> tokens;
	
	string token;
	
	while(getline(iss,token,'/')){
		if(token=="." || token =="")
		continue;
		tokens.push_back(token);
		//cout<<token<<endl;
	}  
	
	
	for(string s:tokens){
		cout<<s<<" ,";
	}
	return "";
}

int main(){
	
	string path="/../x/y/../z/././w/a///../../c/./";
	
	simplifyPath(path);
}
