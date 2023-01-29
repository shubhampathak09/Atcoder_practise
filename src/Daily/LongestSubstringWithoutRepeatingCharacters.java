package Daily;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static boolean uniqueChar(String str,int i,int j){
               Set<Character>s=new HashSet<>();
               while(i<=j){
                if(s.contains(str.charAt(i)))
                    return false;
                else
                {
                    s.add(str.charAt(i));
                }
                i++;
               }
               return true;
    }
    public static void m1(String s){
        /** bf approach **/
        int mx=Integer.MIN_VALUE;
        int n=s.length();
      //  Set<Character> sample=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                //String substr=s.substring(i,j);
                if(uniqueChar(s,i,j)) {
                    mx = Math.max(mx, s.length());
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
        System.out.println("Max length mx.."+mx);
        return;
    }

    public static void main(String[] args){
            //    m1("weer");
    }
}
