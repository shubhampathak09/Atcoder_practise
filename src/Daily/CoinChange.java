package Daily;

public class CoinChange {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5};
        int n = 7;

        int[] dp = new int[n + 1];

        dp[0]=1;

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < dp.length; j++)
            {
                if( j >= arr[i])
                dp[j] += dp[j - arr[i]];
            }
        }

        System.out.println(dp[dp.length-1]);
    }

}
