package Daily;

import java.util.Scanner;

public class BestTimeBuySellStock {

    public static void main(String[] args){

        Scanner scn = new Scanner (System.in)
        ;
            int n= scn.nextInt();

            int [] prices = new int[n]
;


            for(int i =0 ; i< prices.length;i++) {

                prices[i] = scn.nextInt();

            }


            int lsf =Integer.MAX_VALUE;
int op= 0;
int pist =0;

            for(int i =0 ;i<prices.length ;i++ ){
             if(prices[i] <lsf){
                 lsf=prices[i];
             }

            pist = prices[i] -lsf;
            op =Math.max(op,pist);
            }

        System.out.println("Max Profit with one trnsactipn" + op);

    }

}
