#include<bits/stdc++.h>
using namespace std;


void permute(vector<int> a,int i,int j){
	
	 if(i==j)
	 {
	 	for(int k=i;k<=j;k++)
	 	cout<<a[k]<<" ";
	 	cout<<endl;
	 }
	 for(int k=i;k<=e;k++){
	 	swap(a[k],a[i]);
	 	permute(a,i+1,j);
	 	swap(a[k],a[i]);
	 }
}

int main(){
	
	//cool
	
	
	
	
}
