#indclude<bits/stdc++.h>
using namespace std;

bool solveNQueen(int n, int board[][20],int i){
	
	
	if(i==n){
		printBoard();
		return;
	}
	
	
	for(int j=0;i<n;i++){
		if(canplace(board,n,i,j)){
			board[i][j]=1;
			bool sucess = solveNQueen(n,board,i+1);
			if(sucess){
				return true;
			}
			board[i][j]=0;
		}
	}
	board[i][j]=0;
	return false;
}

int main(){
	
	
}
