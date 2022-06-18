// N queen problem

#include<bits/stdc++.h>
using namespace std;

bool canPlace(int board[][20],int n,int x,int y){
	
	
	for(int k=0;k<x;k++){
		if(board[k][y]==1)
		return false;
	}
	
//	left diag check


int i=x;
int j=y;
while(i>=0 && j>=0){
	
	if(board[i][j]==1)
	return false;
	i--;
	j--;
}
	
// right diagonal check	
i=x;
j=y;

while(i>=0 && j<n){
	if(board[i][j]==1)
	return false;
	i--;
	j++;
	
	
	return true;
}	
	
}

void printBoard(int n,int board[][20])
{
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cout<<board[i][j]<<" ";
		}
		cout<<endl;
	}
	
}
bool solveNqueen(int n,int board[][20],int i){
	
	
	// base case
	if(i==n){
		
		printBoard(n,board);
		 return true;
	}
	
	for(int j=0;j<n;j++){
		// whether current i,j is safe or  not
		
		if(canPlace(board,n,i,j)){
			
			board[i][j]=1;
			bool sucess=solveNqueen(n,board,i+1);
			if(sucess){
				return true;
			}
			board[i][j]=0;
		}
	}
	
	return false;
	// recursive case -> place queen in every row
	
	
}

int main(){
	
	
	int board[20][20]={0};
	
	int n=8;
	
//	cin>>n;
	
	
	solveNqueen(n,board,0);
	
	
	return 0;
	
}
