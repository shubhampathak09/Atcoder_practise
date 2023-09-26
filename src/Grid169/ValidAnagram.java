package Grid169;

import java.util.Arrays;

public class ValidAnagram {

    public static  String sortString(String s){
        char tempArray[]= s.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args){
        String s1 = "anagram";
        String s2 = "nagarm";

        s1 = sortString(s1);
        s2 = sortString(s2);

        System.out.println(s1.equals(s2) ? "Valid Anagram" : "Not a Anagram");
    }
}
