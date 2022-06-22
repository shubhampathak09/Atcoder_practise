#include<bits/stdc++.h>
using namespace std;


class Minstack
{
	stack<pair<int,int>>s;
	
	
	public:Minstack(){
		while(!s.empty()){
			s.pop();
		}
	}
	
	void push(int x){
		
		if(s.empty()){
			s.push({x,x});
		}else
		{
	         int curm=s.top().second;		
//			 if(x<curm){
//			 	s.push({x,x});
//			 }else
//			    s.push({x,curm})
             s.push({x,min(x,s.top().second)});    
		}
	}
	
	void pop(){
		
		if(!s.empty()){
			s.pop();
					}
	}
	
	int top(){
		if(!s.empty())
		return s.top().first;		
	}
	
	int getMin(){
		
		return s.top().second;
			}
	
};

int main(){
	
	Minstack mn=Minstack();
	
	mn.push(2);
	cout<<mn.getMin()<<endl;
	mn.push(1);
	cout<<mn.getMin()<<endl;
	
	mn.push(9);
	cout<<mn.getMin()<<endl;
	
	mn.pop();
		mn.push(0);
	    cout<<mn.getMin();
		mn.pop();
		
		cout<<endl;
		
		cout<<mn.getMin();
		
		
		}
