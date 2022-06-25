#include<bits/stdc++.h>
using namespace std;


int solveMatrixMult(vector<int>a ,int i,int j){
	
	if(i>=j)
	return 0;
	
	int result=INT_MAX;
	
	for(int k=i;k<=j-1;k++){
		
		int mult=solveMatrixMult(a,i,k) +solveMatrixMult(a,k+1,j) +a[i-1] *a[k] *a[j];
		
		result=min(result,mult);
		
	}
	return result;
}

int main(){
	
	
	vector<int> a={10,20,30};
	
	
	int n=a.size();
	
	
	int i=1;
	int j=n-1;
	
	
	int finalResult=solveMatrixMult(a,i,j);
	
	
	cout<<finalResult<<endl;
	
}
