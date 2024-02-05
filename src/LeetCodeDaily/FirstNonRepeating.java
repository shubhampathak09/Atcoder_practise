package LeetCodeDaily;

import java.util.HashMap;
import java.util.HashSet;

public class FirstNonRepeating {

    public static int firstUniqeChar(String s) {

        HashMap<Character,Integer> ss = new HashMap<>();

        for( char c : s.toCharArray()){
            ss.putIfAbsent(c,ss.getOrDefault(c,0)+1);
        }

        for(int i =0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(ss.get(c)==1){
                return i;
            }
        }

        return -1;
    }


    public static void main(String[] args){
        String s ="loveleetCode";

        int ans = firstUniqeChar(s);

        System.out.println(ans);
    }

}
