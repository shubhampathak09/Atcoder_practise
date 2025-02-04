#include<bits/stdc++.h>
using namespace std;


int search(int mat[4][4],int n,int x){
	
	if(n == 0)
	return -1;
	
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(mat[i][j] == x){
				cout<<"Element.."<<x;
			}
		}
	}
	return 1;
}

int main(){
	
}
