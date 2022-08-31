//package Algorithms;
//
//public class SubsetSum {
//
//    // Problem statement
//    /*Problem 1.1 Given a set of n
//    numbers ai sum up to M, and any K ≤ M, whether there is a subset of the
//    numbers such that they sum up to (hit) K?
//    We assume n might be as big as 1000,
//    but M or K is not too
//            big
//            */
//
//    public static void solve(int m,int n){
//        int mask[]=new int[m+1];
//
//        for(int i=0;i<mask.length;i++)
//            mask[i]=0;
//        for(int i=0;i<n;i++){
//            for(j=m;j>=a[i];j--)
//            {
//                mask[j]=mask[j]|| mask[j-a[i]];
//            }
//        }
//
//    }
//
//    public static void main(String[] args){
//
//
//
//    }
//
//}
