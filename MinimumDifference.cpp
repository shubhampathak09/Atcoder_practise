#include<bits/stdc++.h>
using namespace std;

int findMinDiff(vector<int>a,vector<int>b){
	int len1=a.size();
	int len2=b.size();
	pair<int,int>temp={-1,-1};
	int i=0;
	int j=0;
	int result=INT_MAX;
	
	while(i < len1 && j <len2){
		
		if(abs(a[i]-b[j])<result){
			result=abs(a[i]-b[j]);
			temp.first=a[i];
			temp.second=b[j];
		}
		
		if(a[i]<b[j]){
			i++;
		}
		else
		 j++;
	}
	if(temp.first!=-1 && temp.second!=-1)
	cout<<temp.first <<" ... "<<temp.second<<endl;
	
	return result;
}

int main(){
	
	vector<int>a={23,5,10,17,30};
	vector<int>b={26,134,135,14,19};
	
	sort(a.begin(),a.end());
	sort(b.begin(),b.end());
	
	int ans=findMinDiff(a,b);
	
	cout<<ans;
	
	cout<<endl;
	

}
