// cherry pick up

#include<bits/stdc++.h>
using namespace std;

int dx={-1,0,1};

int f(int i,int j1,int j2){
	
	
	if(i==n-1){
		if(j1==j2){
			return cost[i][j1];
		}else
		return cost[i][j1] + cost[i][j2];
	}
	
	if(j1<0 || j1 >=n || j2 <0 || j2>=n)
	 return 0;
      
	 int maxi=-1e8;  	 
	 for(int k=0;k<3;k++){
	 	for(int k=0;k<3;k++){
	 		
	 		if(j1==j2){
	 			maxi=max(a[i][j1] + f(i+1,j1+dx[k],j2,dx[k]),maxi);
			 }else
			 maxi=max(a[i][j1] + a[i][j2]+f(i+1,j1+dx[k],j2+fx[k]),maxi);
			 
	 		
		 }
	 }
	 return maxi;
}


int main(){
	
vector<vector<int>>v={{}};	
	
}
