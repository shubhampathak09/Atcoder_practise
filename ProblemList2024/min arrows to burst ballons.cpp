#include<bits/stdc++.h>
using namespace std;


// min arrows to burst ballons


int minArrows(vector<vector<int>> &points){
	
	
	sort(points.begin(),points.end());
	
	int top = points[0][1];
	
	int arrows =1;
	
	
	for(int i=1;i<points.size();i++){
		if(points[i][0] <= top){
			top = min (top,points[i][1]);
		}else
		{
			top = points[i][1];
			arrows++;
		  }  
	}
	
	return arrows;
}



int main(){
	
vector<vector<int>> points = {{1,2},{2,3},{3,4},{4,5}};

int ans = minArrows(points);


cout<< " Min arrows to burst ballons is .."<<ans;

	
	
}
