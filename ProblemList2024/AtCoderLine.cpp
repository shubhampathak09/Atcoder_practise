#include<bits/stdc++.h>
using namespace  std;


string AtCoderLine(){

	int n,x,y,z;
	
	cin>>n>>x>>y>>z;
	
	if(x > y){
		if(x < z && z > y){
			return "yes";
		}
		else
		return "no";
	}else if(x < y){
		if( x < z && z < y)
		{
			return "yes";
		}
		else
		return "no";
	}else
	{
		if( x == y && y == z)
		return "yes";
		else
		return "no";
	}
}


int main(){
	
	string result  = AtCoderLine();
	
	cout<<result;
	
}
