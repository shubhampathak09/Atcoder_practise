package Daily;

public class CoinChangePermutations {


     public static void main(String args[]){

         int[] coins ={2,3,5,6};

         int sum =10;


        int[] dp = new int[sum +1];

        dp[0]=1;


        for(int i =1 ;i<dp.length ;i++){

            for(int j =0 ;j< coins.length;j++){
                if( coins[j] <=i){
                 dp[i] += dp[i-coins[j]];
                }
            }
        }

         System.out.println(dp[dp.length-1]);
        }


    }


