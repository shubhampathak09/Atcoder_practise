// first and last occurence

#include<bits/stdc++.h>
using namespace std;



int findOcuurence(int arr[],int element){



    int n = sizeof(arr) / sizeof(arr[0]);
    
  int l = 0;
    int r = n - 1;
    int ans = -1;


   while (l <= r) {
        int mid = l + (r - l) / 2;
        if (arr[mid] == element) {
            ans = mid;
            r = mid - 1;  // Continue searching in the left half for the first occurrence
        } else if (arr[mid] < element) {
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    return ans;
    
}

int main(){
	int arr[]={2,4,10,10,10,18,20};
	int e=10;
	
	//cout<<findOcuurence(arr,e);
	
	   int firstOccurrence = findOccurrence(arr, n, e);
}
