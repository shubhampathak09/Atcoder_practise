#include<bits/stdc++.h>
using namespace std;

int main(){
	
	
	vector<int> arr={0,0,0,0,0,0};
	int n=arr.size();
	int cursum=0;
	int maxsum=0;
	for(int i=0;i<n;i++){
		if(cursum<0){
			cursum=arr[i];
		}else{
			cursum+=arr[i];
		}
		if(cursum>maxsum)
		maxsum=cursum;
	}
	cout<<maxsum<<endl;
}
