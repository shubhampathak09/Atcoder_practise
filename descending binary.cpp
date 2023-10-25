#include<bits/stdc++.h>
using namespace std;


void test(){
	
	int arr[] ={10,8,9,7,1,2,3};
	
	int n= sizeof(arr)/sizeof(arr[0]);
	
	
	int l=0;
	
	int r=n-1;
	
	int element=1;
	
	while(l<=r){
		
		int mid=(l+r)/2;
		
	    cout<<mid<<endl;		
		if(arr[mid]==element){
		
			cout<<mid<<endl;
			return;
		}else if(arr[mid]<element){
			l=mid+1;
		}else
		{
			r=mid-1;
		}
	}
	
	
}

int main(){
	
	test();
	
}
