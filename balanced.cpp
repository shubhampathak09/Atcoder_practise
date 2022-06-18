// stacks quueue dequeue

// balanced parantesis

#include<bits/stdc++.h>
using namespace std;


bool isBalanced(string input){
	
	stack<char> s;
	
	
	for(int i=0;i<input.length();i++){
		
		
		char ch=input[i];
		
		switch(ch){
			
			case '(': s.push(ch);
			        break;
			case '[': s.push(ch);
			         break; 
			case '{':s.push(ch);
			         break;
				
			case ')':
				if(!s.empty()&& s.top()=='(')
				    s.pop();
				 else
				    return false; 
				    break;
					
			case ']':
				if(!s.empty()&& s.top()=='[')
				    s.pop();
				 else
				    return false;
				    break;
			case '}':
				if(!s.empty()&& s.top()=='{')
				    s.pop();
				 else
				    return false; 		 		  
			        break;
			default: continue;
		}
		
	}
	
	if(s.empty())
	return true;
	
	return false;
}

int main(){
	
	 string s="()()}";
	
	bool ans=isBalanced(s);
	
	if(ans){
		cout<<"Balanced";
	}else
	cout<<"Not Balanced";
	
}

