package Codewars;

import java.util.ArrayList;

public class NumberToReversedArrray {
    public static int[] digitize(long n) {
       ArrayList<Integer> ar=new ArrayList<>();
       while(n> 0){
           int l=(int) n %10;
           ar.add(l);
           n=n/10;
       }
       int[] a=new int[ar.size()];
       for(int i=0;i< ar.size();i++)
           a[i]=ar.get(i);
       return a;
    }
    public static void main(String[] args){
      int[] x =digitize(3214);
      for(int i=0;i<x.length;i++)
          System.out.println(x[i]+" ");
    }
    // !v bad approach!
}
