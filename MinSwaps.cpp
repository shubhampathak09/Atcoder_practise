// minimum swaps
#include<bits/stdc++.h>
using namespace std;

int countMinSwaps(vector<int> arr){
	// know the ac positions
	int n=arr.size();
	pair<int,int>ap[n];
	for(int i=0;i<n;i++){
		ap[i].first=arr[i];
		ap[i].second=arr[i];
			}
	int ans=0;
	
	//54321
	sort(ap,ap+n);
	
	
	// 1 2 3 4 5
	// 4 3 2 1 0
	// 0 1 2 3 4
	// build the main logic
    vector<bool> visited(n,false);
	for(int i=0;i<n;i++){
		
		// if element is vvisited or element is right position
		
		int old=ap[i].second;
		if(visited[i]==true || old ==i){
			continue;
		}
		
		// if element is not visited
		int node=i;
		int cycle=0;
		while(visited[node]==false){
			visited[i]=true;
			int next_node=ap[node].second;
			node=next_node;
			cycle+=1;
		}
		
		ans +=(cycle-1);
		
	}
	
	
	// store the current indices
	
	return ans;
}

int main(){
//
//vector<int>a{5,4,3,2,1};
//int an=countMinSwaps(a);
//cout<<an<<endl;	
}
