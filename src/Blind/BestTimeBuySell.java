package Blind;

public class BestTimeBuySell {

    public int maxProfit(int[] prices){
        int min=prices[0];

        int profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }

            profit= prices[i]-min;

        }
        return profit;
    }

}
