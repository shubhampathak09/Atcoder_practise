// suduko solver

#include<bits/stdc++.h>
using namespace std;


// 123 ghante nikale padenge beta!!

// tu toh 150 rakh ->  150 /24 -= 1 week *  ~ around 1 month

bool isSafe(int mat[][9],int i,int j,int no,int n){
	
	
	// check for row and col
    for(int k=0;k<n;k++){
    	if(mat[k][j]==no || mat[i][k]==no)
    	return false;
	}  	  
	
	// number present in 3 X 3 subgrid :-
	
	int sx=(i/3) * 3;
	int sy=(j/3) * 3;
	for(int x=sx;x<sx+3;x++){
		for(int y=sy;y<sy+3;y++){
			if(mat[sx][sy]==no)
			return false;
		}
	}
	
	
	return true;
}

bool solveSudoku(int mat[][9],int i,int j,int n){
	
	// base case
	
	
	if(i==n){
		
		// print solution
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				cout<<mat[i][j]<<" ";
			}
			cout<<endl;
		}
		return true;
		
	}
	
	
	// recursive case
	if(j==n){
		
		
		return solveSudoku(mat,i+1,0,n);   // reached current row end move to next row
		
	}
	
	
	// prefilled cell then skip them
	if(mat[i][j]!=0){
		return solveSudoku(mat,i,j+1,n);
	} 
	
	// cell to e filled
	// try all combinations
	
	for(int no=1;no<=n;no++){
		
		if(isSafe(mat,i,j,no,n))
		{
			mat[i][j]=no;
			bool solveSubproblem=solveSudoku(mat,i,j+1,n);
			if(solveSubproblem==true){
				return true;
			}
			
		}
		
}

mat[i][j]=0;
return false;

	
}
 
 int main(){
 	
 	int n=9;
 	int mat[9][9]=
 	{
 		
 		{5,3,0,0,7,0,0,0,0
		 },{6,0,0,1,9,5,0,0,0},{
		 	0,9,8,0,0,0,0,6,0
		 }
 		,{8,0,0,0,6,0,0,0,3},{
 			4,0,0,8,0,3,0,0,1
		 },{
		 	7,0,0,0,2,0,0,0,6
		 },{
		 0,6,0,0,0,0,2,8,0
		 },{
		 	0,0,0,4,1,9,0,0,5
		 },{
		 	0,0,0,0,8,0,0,7,9
		 }
	 };
 	
 	
 	if(!solveSudoku(mat,0,0,n))
 	cout<<"No sol";
 	
 }
 
