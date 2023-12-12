#include<bits/stdc++.h>
using namespace std;


bool checkZeroSum(vector<int> arr){
	
	set<int>s;
	
	int sum=0;
	
	for(int i=0;i<arr.size();i++){
		sum+=arr[i];
		if(arr[i]==0 || sum == 0 || s.find(sum)!=s.end()){
			return true;
		}
		s.insert(sum);
	}
	
	return false;
}

int main(){
	
	
	vector<int>arr = {-3,2,3,1,6};
	
	bool check = checkZeroSum(arr);
	
	if(check){
		cout<<"Zero Sum exists";
	}else{
		cout<<"Zero Sum does not exists";
	}
}
