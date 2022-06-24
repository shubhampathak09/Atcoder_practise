/*
Given two strings s and t, return true if they are equal 
when both are typed into empty text editors. 
'#' means a backspace character.

Note that after backspacing an empty text, 
the text will continue empty.
*/

// backspace string compare
#include<bits/stdc++.h>
using namespace std;

int main(){
	
	string s="#abb##vb####vvvbfrr#";
	
	//	string s="vvvbfr";  
	  
	int len=0;
	for(int i=0;i<s.length();i++){
		
		if(s[i]=='#'){
			if(len>0)
			len--;
		}else
		{
			s[len++]=s[i];
		}
	}
	
	s.resize(len);
	
	cout<<s;
	
}
