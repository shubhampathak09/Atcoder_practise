package Daily;

public class PaintHouse {

   public static void main(String[] args){

       int[][] arr= {{1,5,7,},{5,8,4},{3,2,9},{1,2,4}};

       int n=arr.length;

       int[][] dp = new int[n][n];


       dp[0][0] =1;  // r
       dp[0][1] = 1;  //g
       dp[0][2] =1;  //b


       for(int i =1; i< n;i++){

           dp[i][0] = arr[i][0] + Math.min(dp[i-1][1],dp[i-1][2]);
           dp[i][1] =arr[i][1] +  Math.min(dp[i-1][0],dp[i-1][2]);
           dp[i][2] =arr[i][2] + Math.min(dp[i-1][1],dp[i-1][0]);
       }

long ans  = Math.min(Math.min(dp[n-1][0],dp[n-1][1]),dp[n-1][2]);

       System.out.println(ans);


   }

}
