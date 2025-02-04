package Daily.CodingInterviewGeneral2024;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatedCharacters {

    public static boolean areDistinct(String str,int i,int j){
        HashSet<Character>hs=new HashSet<>();
        for(int k=i;k<=j;k++){
            if(hs.contains(str.charAt(k)))
                return false;
            else
                hs.add(str.charAt(k));
        }
        return true;
    }

    public static int longestSubString(String str){
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(areDistinct(str,i,j)){
                    res =Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
           String str="geeksforgeeks";
           int len=longestSubString(str);
        System.out.println(len);
    }
    /** time complextity
     *  o(n^3)
     * **/
}
