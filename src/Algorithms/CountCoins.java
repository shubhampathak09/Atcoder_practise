package Algorithms;

public class CountCoins {


    /** recursive approach ** /
     *
     * @param coin
     * @param n
     * @param sum
     * @return
     */
    static int count1(int coin[],int n,int sum){

        if(sum==0)
            return 1;
        if(sum < 0)
            return 0;
        if(n <=0 )
            return 0;

        return count1(coin,n-1,sum) + count1(coin,n,sum-coin[n-1]);
    }

    public static void main(String[] args){
           int coins[] ={1,2,3};
           int n=coins.length;
        System.out.println(count1(coins,n,4));
    }

}
