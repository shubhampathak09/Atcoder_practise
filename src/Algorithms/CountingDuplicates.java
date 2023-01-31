package Algorithms;

import scala.Int;

import java.util.HashMap;

public class CountingDuplicates {

    /**problem satement**/
    /**
    Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
    **/

    public static int duplicateCount(String text) {
        // Write your code here
        HashMap<Character, Integer>hs=new HashMap<>();
        //0(n)
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if((c>='a' && c<='z')|| (c>='A' && c<='Z')){
            Character ch=Character.toLowerCase(c);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
            }else
            hs.put(c,hs.getOrDefault(c,0)+1);
        }

        int count=0;
        //0(n)
        for(Character x: hs.keySet()){
            if(hs.get(x) > 1){
                count++;
            }
        }
        //total  time complextiy =o(n)
        return count;
    }

    public static void  main(String[] args){
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("aabBcde"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount(("Indivisibilities")));
        System.out.println(duplicateCount("aA11"));
        System.out.println(duplicateCount("ABBA"));
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

/**
    Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
            "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
            "ABBA" -> 2 # 'A' and 'B' each occur twice

**/

}
