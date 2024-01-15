// 30 days trainig starting from scrach

// https://codeforces.com/problemset/problem/231/A


#include<bits/stdc++.h>
using namespace std;

int main()

{
	
	
	int n;
	
	cin>>n;
	
	int ans =0;
	
	while(n > 0){
		
		int a;
		int count =0;
		int ans =0;
		for(int i=0;i<3;i++)
		{
		cin>>a;
		if(a==1)count++;	
		}
		if(count >=2)
		ans++;
		
		n= n-1;
	}
	
	cout<<ans;
	
}
