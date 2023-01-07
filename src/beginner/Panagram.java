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
        }


}
