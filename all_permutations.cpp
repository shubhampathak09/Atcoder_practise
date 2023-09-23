#include<bits/stdc++.h>
using namespace std;


int main(){
	
	vector<int> list={3,2,1};
	
	sort(list.begin(),list.end());
	
	do{
		for(int i=0;i<list.size();i++){
			cout<<list[i]<<" ";
		}
		cout<<endl;
	}while(next_permutation(list.begin(),list.end()));
	
	
	
	
}
