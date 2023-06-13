package Daily;

import java.util.Scanner;

public class BuySellStock5 {

     public static void main(String[] args){
         Scanner scn = new Scanner(System.in)
;

         int n= scn.nextInt();

         int[] arr = new int[n];

         for(int i =0 ;i< arr.length ;i++){
          arr[i] = scn.nextInt();
         }

         int mpist =0;
         int leastsf=arr[0];
         int[] dpist= new int[arr.length];
         //dp[0]=0;
         for(int i=1;i<n;i++){
             if(arr[i] < leastsf){
                 leastsf =arr[i];
             }
             mpist = arr[i] -leastsf;

         if(mpist > dpist[i-1]){
                 dpist[i]=mpist;
             }else
             {
                 dpist[i]=dpist[i-1];
             }
         }
         int mpibt=0;
         int mxat=arr[arr.length -1];

         int[] dpibt = new int[arr.length];

         for(int i=arr.length-2 ;i>=0;i--){
             if(arr[i] > mxat){
                 mxat =arr[i];
             }
             mpibt = mxat - arr[i];
             if(mpibt > dpibt[i+1]){
                 dpibt[i]=mpibt;
             }else
             {
                 dpibt[i]=dpibt[i+1];
             }
         }

         int sum=0;
         for(int i=0;i<n;i++){
             sum =Math.max(sum, dpist[i] + dpibt[i]);
         }
         System.out.println(sum);
     }

}
