#include<bits/stdc++.h>
using namespace std;

vector<int> pairSum(vector<int>arr,int s){
	
	vector<int>result;
	unordered_set<int>m;
	for(int i=0;i<arr.size();i++){
		int x=s-arr[i];
		if(m.find(x)!=m.end()){
			result.push_back(x);
			result.push_back(arr[i]);
			return result;
		}
		m.insert(arr[i]);
	}
	return {};
}

int main(){

vector<int> arr={10,5,2,3,-6,9,11};

vector<int> ans=pairSum(arr,4);

if(ans.size()==0){
	cout<<"No pair sum exists";
	return 0;
}
cout<< ans[0]<<" "<<ans[1]<<endl;
	
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
