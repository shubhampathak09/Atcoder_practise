package Codewars.CodingInterviewGeneral;

import java.util.Arrays;

public class TwoSum {

    static  boolean hasTwoSum(int[] A,int n,int sum){
        Arrays.sort(A);
        int l=0;
        int r=A.length-1;
        while(l<=r){
            if(A[l] + A[r] ==sum){
                return true;}
                else if(A[l] +A[r] <=sum){
                    l=l+1;
                }else
                    r=r-1;
            }
        return false;
    }

    public static void main(String[] args){

    }
}
