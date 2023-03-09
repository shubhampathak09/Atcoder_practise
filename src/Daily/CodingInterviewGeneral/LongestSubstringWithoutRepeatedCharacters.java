package Daily.CodingInterviewGeneral;

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

    public static void main(String[] args){

    }
}
