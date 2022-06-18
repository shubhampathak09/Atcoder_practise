// redundant paantheses

#include<bits/stdc++.h>
using namespace std;


 bool checkRedunant(string str){
 	
 	
 	stack<char> s;
 	
 	for(int i=0;i<str.length();i++){
 		char ch=str[i];
 		if(ch!=')')
 		s.push(ch);
 		else
 		{
 			//  ')'
 			bool is_op=false;
 			
 			while(s.empty()&& s.top() !='('){
 				
 			 char top=s.top();
			  if(top=='+'|| top == '-' || top =='*' || top=='/' )
			  {
			  	is_op=true;
				  }	
                s.pop();			
			 }
 			s.pop();
 			
 			if(is_op==false){
 				return true;
			 }
 			
		 }
 		
	 }
 	
 	return false;
 	
 }
 
 int main(){
 	
 	string str="((a+b)+c)+(d*e)";
 	
 	if(checkRedunant(str))
 	{
 		cout<<"contains redundant brackets";
	 }else
	 cout<<"does not contain redundant bracket";
 }
 
 // strnage
 
