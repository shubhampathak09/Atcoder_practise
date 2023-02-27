// mountain

// thinking appoach
// 1. identify where the peaks are
//

#include<bits/stdc++.h>
using namespace std;

int highest_moutain(vector<int> arr)
{
	int n=arr.size();
	int largest=0;
	
	for(int i=1;i<=n-2;){
		// first and last elements cant be peaks so we astart from
		// second and got second last element in loop
		
		// check a[i] is peak
		if(arr[i]>arr[i-1] && arr[i]> arr[i+1]){
			
			// count back
			int cnt=1;
			int j=i;
			while(j>=1 && arr[j]>arr[j-1]){
				j--;
				cnt++;
			}
			
			while (i<=n-2 && arr[i]>arr[i+1]){
				i++;
				cnt++;
			}
			
			// count forward
			largest=max(largest,cnt);
			
		}else
		{
			i++;
		}
	}
	return largest;
}
int main(){
	
	vector<int> arr{5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
	cout<< highest_moutain(arr);
	return 0;
	
	
	// o/p  -> 9
}
