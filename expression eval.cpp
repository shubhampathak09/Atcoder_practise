#include<bits/stdc++.h>
using namespace std;


int precedance(char op){
	
	if(op == '+'){
		return 1;
	}else  if(op == '-'){
		return 1;
	}else  if(op == '*'){
		return 2;
	}else if( op =='/'){
		return 2;
	}
	
}

int operation(int v1,int v2,char op){
	
		if(op == '+'){
		return v1+v2;
	}else  if(op == '-'){
		return v1-v2;
	}else  if(op == '*'){
		return v1*v2;
	}else if( op =='/'){
		return v1/v2;
	}
	
}

int main(){
	
	string s="2+(5-3*6/2)";
	
	stack<int>operand;
	stack<char>opr;
	
	for(int i=0;i<s.length();i++){
		
	if(s[i]=='('){
		opr.push(s[i]);
	}else if(s[i]-'0' >=0 && s[i]-'0'<=9){
		operand.push(s[i]-'0');
	}	
	else if(s[i]==')'){
		while(opr.top()!='('){
			char op=opr.top();
			opr.pop();
			int v2=operand.top();
			operand.pop();
			int v1=operand.top();
			operand.pop();
			int val=operation(v1,v2,op);
			operand.push(val);
		}
		opr.pop();  // popthe weasel
	}else if(s[i]=='+' || s[i]=='-' || s[i]=='/' || s[i]=='*'){
		while(opr.top()!='(' && opr.size()>0 && precedance(s[i])<=precedance(opr.top()))
		{
			// pop
			char op=opr.top();
			opr.pop();
			int v2=operand.top();
			operand.pop();
			int v1=operand.top();
			int val=operation(v1,v2,op);
			operand.push(val);
		}
		opr.push(s[i]);
	}	
	}
	while(opr.size()>0){
		char op=opr.top();
		opr.pop();
		int v2=operand.top();
		operand.pop();
		int v1=operand.top();
		operand.pop();
		int val=operation(v1,v2,op);
		operand.push(val);
	}
	
	cout<<operand.top();
}
