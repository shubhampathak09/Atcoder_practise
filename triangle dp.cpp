// triangle
// count
// max sum
#include<bits/stdc++.h>
using namespace  std;
 
 
 
 int f(int i,int j,int n,int m,vector<vector<int>>&triangle){
 	
 	if(i==n-1){
 		return triangle[n-1][j];
	 }
 	
// 	if(i+1>=n)
// 	return 0;
// 	
// 	if(j+1>=m)
// 	return 0;
// 	
 	int down=triangle[i][j] + f(i+1,j,n,m,triangle);
 	int diag=triangle[i][j] +f(i+1,j+1,n,m,triangle);
 	
 	return min(down,diag);
 	
 	
 	
 }
 
 int main(){
 	
 	vector<vector<int>>triangle={{1},{2,3},{4,5,6},{7,8,9,10}};
 	
 	int n=triangle.size();
 	int m=triangle[0].size();
	  	
 	int ans=f(0,0,n,m,triangle);
 	
 	cout<<ans;
 	
 	
 }
