package Daily;

public class LIS {

    public static void main(String[] args){

        int[] arr = {10,22,9,33,1,50,41,60,80,1};


   int n= arr.length;



        int ovmax= 1;
   int[] dp = new int[n];

   dp[0]=1;

   for(int i =1 ;i< n ;i++){

   int max =0;



   for(int j =0 ;j< i;j++){

       if(arr[j] < arr[i]){
           if(dp[j] > max){
               max = dp[j];
           }
       }

   }
   dp[i]=max +1;

   if(dp[i] > ovmax){
       ovmax =dp[i];
   }

   }

        System.out.println(ovmax);
    }

}
