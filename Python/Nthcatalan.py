# -*- coding: utf-8 -*-
"""
Created on Thu Jan 26 10:49:07 2023

@author: Shubham Pathak
"""  

arr=[0 for i in range(10000 + 1)]
arr[0]=1
arr[1]=1 
def nth_cataln_number(n):
    res=0
    if(n<=1):
       return 1
    if(arr[n]!=0):
       return arr[n]
    for i in range(n):
       res+=nth_cataln_number(i)*nth_cataln_number(n-1-i)
       arr[i]=res
    return res     
       
for i in range(10):
    print(nth_cataln_number(i))
    