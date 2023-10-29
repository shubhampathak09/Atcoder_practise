#include<bits/stdc++.h>
using namespace std;


bool isSafe(int mat[][],int i,int j,int no,int n){

for(int k=0;k<n;k++){
	if(mat[k][j]==no || mat[i][k]==no)
	return false;
}
	
	// subgrid
	
	int sx = (i/3) * 3;
	int sy = (j/3) * 3
	
	for(int x =sx ; x<sx+3;x++){
		for*int y=sy;y<sy+3;y++){
			if(mat[x][y]==no)
			return false
		}
	}
	
	
	return true;
}

bool solveSudoku(int mat[][9],int i,int j,int n){
	if(i==n){
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				cout<<mat[i][j]<<" ";
			}
			cout<<endl;
		}
		
		return true;
	}
	
	if(j==n){
		return solveSudoku(mat,i+1,0,n);
	}
	
	if(mat[i][j]!=0){
		return solveSudoku(mat,i,j+1,n);
	}
	
	for(int no=1;no<n;i++){
		if(isSafe(mat,i,j,no,n)){
			mat[i][j]=no;
			bool solveRemain = solveSudoku(mat,i,j+1,n);
			if(solveRemain==true){
				return true;
			}
		}
	}
	
	mat[i][j]=0;
	return false;
}

int main(){
	// test
	
	
}
