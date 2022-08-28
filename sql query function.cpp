// check if two numbers are  divisible by x and y;

#include<bits/stdc++.h>
using namespace std;

int main(){
	
	//sql code
	
	SELECT id,
  CASE WHEN mod(n,x) = 0 and mod(n,y) = 0 then 'true'
       ELSE 'false'
  END res
FROM kata;
	
}
