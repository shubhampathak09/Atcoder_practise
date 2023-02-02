package Codewars;

public class GoodVsEvil {

    public static String battle(String goodAmounts, String evilAmounts) {

        String goodConst="Battle Result: Good triumphs over Evil";
        String badConst="Battle Result: Evil eradicates all trace of Good";
        String tieConst="Battle Result: No victor on this battle field";

        String[] nga=goodAmounts.split(" ");
        String[]  nba=evilAmounts.split(" ");
        int[] good={1,2,3,3,4,10};
        int [] bad={1,2,2,2,3,5,10};
        int glen=nga.length;
        int blen=nba.length;
        int goodScore=0;
        int badScore=0;
        for(int i=0;i<glen;i++){
         int number=Integer.parseInt(nga[i]);
         goodScore+= (number*good[i]);
        }
        for(int j=0;j<blen;j++){
            int number=Integer.parseInt((nba[j]));
            badScore+=(number*bad[j]);
        }
        System.out.println("GoodScore.."+goodScore);
        System.out.println("BadScore.."+badScore);
        if(goodScore>badScore){
            return goodConst;
        }else if(goodScore<badScore)
        {
            return badConst;
        }else
            return tieConst;

    }
     public static void main(String[] args){
     //    System.out.println(battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
         System.out.println(battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }
}
