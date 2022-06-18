// celebrity problemm

#include<bits/stdc++.h>
using namespace std;

int main(){
	
	stack<int>st;
	
	vector<int> arr={};
	
	for(int i=0;i<arr.size();i++){
		st.push(i);
	}
	
	
	while(st.size()>=2){
		
		int i=st.top();
		st.pop();
		int j=st.top();
		st.pop();
		
		if(arr[i][j]==1){
		//	if i know j then is not celebrity
		st.push(j);
		} else
		{    st.push(i);
			// i does not know j  -> j is not celebrity
		}
		
	}
	
	int pot=st.top();
	st.pop();
	
	for(int i=0;i<arr.size();i++){
		if(i!=pot){
			if(arr[i][pot]==0 || arr[pot][i]==1)
			cout<<"none";
			return 0;
		}
	}
	
	cout<<pot;
}
