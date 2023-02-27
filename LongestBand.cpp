// Longest Band

#include<bits/stdc++.h>
using namespace std;

int largestBand(vector<int> arr){
	int n=arr.size();
	
	// Store the Data in set
	
	unordered_set<int>s;
	for(int x: arr){
		s.insert(x);
	}
	
	/// Iterate over the array
	int largestBand=1;
	for(auto element: s){
		int parent=element-1;
		if(s.find(parent)==s.end()){
			// find entire chain lenght and store it
			int next= element+1;
			int cnt=1;
			while(s.find(next)!=s.end()){
				next=next+1;
				cnt++;
			}
			if(cnt > largestBand){
				largestBand=cnt;
			}
		}
	}
	return largestBand;
}

int main(){
	vector<int> arr={1,9,3,0,18,5,2,4,10,7,12,6};
	cout<<largestBand(arr);
}
