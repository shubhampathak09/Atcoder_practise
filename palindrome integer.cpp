//palindrome numner

#include<bits/stdc++.h>
using namespace std;

bool check(int x){
	
	int res=x;
//	cout<<res<<endl;
	int sum=0;
	while(res> 0){
		
		int rem=res%10;
//		cout<<rem<<endl;
		sum = sum * 10 + rem;
		cout<<sum;
		res=res/10;
		
		
	}
	 cout<<sum<<endl;
	return sum ==x;
	
}

int main(){
	
	
	cout<< check(11211);
	
	//cout<<check(10);
	
	//cout<<check(101);
	
	//cout<<check(2);
	
	///cout<<check(29);
	
		
}
