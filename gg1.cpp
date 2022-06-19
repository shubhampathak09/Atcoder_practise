#include<bits/stdc++.h>
using namespace std;



bool isSafe(int mat[][9],int i,int j,int no,int n){
	
	//
	for(int k=0;k<n;k++){
		if(mat[k][j]==no || mat[i][k]==no)
		return false;
	}
	
	int sx=(i/3) *3;
	int sy=(j/3) *3;
	
	for(int x=sx;x<sx+3;x++){
		for(int y=sy;y<sy+3;y++){
            if(mat[x][y]==no)
			return false;			
		}
	}
	
	return true;
	
}

bool solve1(int mat[][9],int i,int j,int n){
	
	if(i==n){
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			cout<<mat[i][j]<<" ";
			cout<<endl;
		}
		
		return true;
	}
	
	if(j==n){
		return solve1(mat,i+1,0,n);
	}
	
	if(mat[i][j]!=0)
	return solve1(mat,i,j+1,n);
	
	
	for(int no=1;no<=n;no++){
		
		if(isSafe(mat,i,j,no,n)){
			mat[i][j]=no;
			bool solve=solve1(mat,i,j+1,n);
			if(solve==true)
			return true;
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
	
	
	bool ans=solve1(mat,0,0,n);
	
	
	cout<<ans;
	
}
