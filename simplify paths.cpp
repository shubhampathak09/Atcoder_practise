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
	
	
 
	
	vector<string>stack;
	
	if(path[0]=='/'){
		// denotes paths is abs path
		
		stack.push_back("");
		
	}
	
	
	for(string token: tokens){
		
		if(token==".."){
			
			// abs path   or relative path
			
			if(stack.size()==0 || stack[stack.size()-1]=="..")
			{
				stack.push_back("..");
			}
			else if(stack[stack.size()-1]!=".."){
				stack.pop_back();
			}
			
			
		}else
		{
		stack.push_back(token);	
		}
		
	}
	
	if(stack.size()==1 && stack[0]=""){
		return "/";
	}
	//2.
	//abs vs relative path
	// ..
	// /a/b/../..  /
	
	
	ostringstream oss;
	
	for(auto  token :stack){
		oss<< token<<"/";
	}
	
	
	
	return oss.str();
}

int main(){
	
	string path="/../x/y/../z/././w/a///../../c/./";
	
	simplifyPath(path);
}
