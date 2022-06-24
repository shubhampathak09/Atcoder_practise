// evalaute post fix expression
#include<bits/stdc++.h>
using namespace std;

int evaluate(int v1,int v2,char op){
	
	if(op=='+'){
		return v1+v2;
	}else if(op=='-'){
		return v1-v2;
	}else if(op=='*'){
		return v1*v2;
	}else if(op=='/'){
		return v1/v2;
	}
}

int main(){
	
	 
	 
	 
char s[]={
'2','1','+','3','*'}
	;
	
	int n=sizeof(s)/sizeof(s[0]);
	
	stack<int> operand;
 
	
	for(int i=0;i<n;i++){
		
		if(s[i]=='+'|| s[i]=='-' || s[i]=='*' || s[i]=='/' ){
			
			char op=s[i];
			int v2=operand.top();
			operand.pop();
			int v1=operand.top();
			operand.pop();
			int val=evaluate(v1,v2,op);
			operand.push(val);
		}else
		{
			operand.push(s[i]-'0');
		}
		
	}
	
	if(operand.size()==1){
		cout<<operand.top();
	}
	return 0;
}
