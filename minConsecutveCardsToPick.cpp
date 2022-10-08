#include<bits/stdc++.h>
using namespace std;


int minconsecutive(vector<int> cards){
	
	int ways = INT_MAX;
	
	for(int i=0;i<cards.size();i++){
		int current=cards[i];
		for(int j=i+1;j<cards.size();j++){
			if(cards[j]==current){
				ways=min(ways,j-i+1);
			}
		}
	}
	if(ways==INT_MAX)
	return -1;
	else
	return ways;
}

int main(){
	
	// brute force  -> time complextty ?
	
	// optimisation possible ?
	
	// wrtie optimised code
	
	// time complwxity -? is further aoptimsation possib;e?
/*	
	You are given an integer array cards where cards[i] represents 
	the value of the ith card. A pair of cards are matching if the cards have the same value.

Return
 the minimum number of consecutive cards you have to pick up to have a pair of matching 
 cards among the picked cards. If it is impossible to have matching cards, return -1.
*/
vector<int>cards={1,0,5,3};
int n=cards.size();

int ans=minconsecutive(cards);

cout<<ans;
	
}
