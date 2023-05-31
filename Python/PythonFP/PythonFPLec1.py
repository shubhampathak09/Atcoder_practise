# -*- coding: utf-8 -*-
"""
Created on Sat May 27 09:45:21 2023

@author: 91954
"""

## Python Functional Programming book  -> packt 

#simple lamda expression

multiple_3_5=lambda x : x % 3 == 0 or x % 5 == 0


# recursive def for sum of sequences

def sum(seq):
    if(len(seq) == 0): return 0
    return seq[0] + sum(seq[1:])


def until(n,filter_func ,v):
    if(v == n): return []
    if(filter_func(v)):
     return [v] + until(n,filter_func,v+1)
    else: return until(n,filter_func,v+1)



until(10,multiple_3_5,0)