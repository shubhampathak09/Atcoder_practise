package Daily;

import java.util.Scanner;

public class BuySellStock6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k =sc.nextInt();

        int[][] dp =new int[k+1][n+1];

        for(int t =1;t<=k;t++){
            for(int d=1 ;d<=arr.length;d++){

                int max=dp[t][d-1];

              //  dp[t][d] = dp[t][d-1];

                for(int pd = 0 ;pd < d ;pd ++){
                    int ptilltm1 = dp[t-1][d];
                    int pth = arr[d] - arr[pd];

                    if(ptilltm1 +pth > max){
                        max=ptilltm1+pth;
                    }

                }
                dp[t][d]=max;
            }
        }
        System.out.println(dp[k][n]);
    }
}
