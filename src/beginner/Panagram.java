package beginner;

import java.util.HashSet;

public class Panagram {

        public static boolean check(String sentence){
            HashSet<Character>s=new HashSet<>();
            for(int i=0;i<sentence.length();i++){
                if(Character.isLetter(sentence.charAt(i))) {
                    char lower = Character.toLowerCase(sentence.charAt(i));
                    s.add(lower);
                }
            }
            return s.size()==26;
            //code
        }
        public static void main(String[] args){
            System.out.println(check("The quick brown fox jumps over the lay dg."));
            String s1="The quick brown fox jumps over the lay dg.";
            System.out.println("Method 2.."+   check1(s1));
        }
        public static  boolean check1(String Sentence){
            for(char c='a';c<='z';c++){
                if(!Sentence.toLowerCase().contains(""+c)){
                    return false;
                }
            }
            return true;
        }

        // Pangram checker  -> 793 to 801  codewars  

}
