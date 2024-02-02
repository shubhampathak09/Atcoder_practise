#include<bits/stdc++.h>
using namespace std;


void rotate(int arr[],int d,int n){
	
	int temp[n];
	
	int k=0;
	
	for(int i=d ; i<n;i++){
		
		temp[k]=arr[i];
		k++;
	}
	
	for(int i=0;i<d;i++){
		temp[k]=arr[i];
		k++;
	}
	
	for(int i=0;i<n;i++){
		arr[i] = temp[i];
	}
	
}

void printTheArray(int arr[],int n){
	for(int i=0; i<n;i++){
		cout<<arr[i]<<" ";
	}
}

int main(){
	
	int arr[]= {1,2,3,4,5,6,7};
	int n = sizeof(arr)/sizeof(arr[0]);
	int d=2;
	rotate(arr,d,n);
	printTheArray(arr,n);
}
