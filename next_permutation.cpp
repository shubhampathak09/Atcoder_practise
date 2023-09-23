// nxt permutation

#include<bits/stdc++.h>
using namespace std;


vector<int> nextGreaterPermutation(vector<int> &vec){
	
	int ind =-1;
	
	int n=vec.size();
	
	for(int j=n-2 ;j>=0;j--){
		
		if(vec[j]<vec[j+1]){
			ind=j;
			break;
		}
		
	}
//	cout<<vec[ind]<<"....."<<endl;
	if(ind == -1){
		reverse(vec.begin(),vec.end());
		return vec;
	}
	
	for(int i = n-1 ;i>ind ;i--){
		if(vec[i] > vec[ind]){
			//cout<<vec[i]<<"... ";
			swap(vec[i],vec[ind]);
			break;
		}
		
	}
	
	//for(int i=0;i<)
	reverse(vec.begin()+ind+1,vec.end());
	
	return vec;
	
}

int main(){
	
	vector<int> v= {2,1,5,4,3,0,0};
	
	vector<int> res = nextGreaterPermutation(v);


    for(int i=0;i<res.size();i++)
	cout<<res[i]<<" ";	
}
