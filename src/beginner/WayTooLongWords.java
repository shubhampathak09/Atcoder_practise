package beginner;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        int n=s.nextInt();

        while(n> 0){
            String word=s.nextLine();
            String newword="";
            if(word.length()>10){
                String wordApeend=Integer.toString(word.length()-2);
                newword+=word.charAt(0) + wordApeend +word.charAt(word.length()-1);
                word=newword;
            }
            n--;
            System.out.println(word);
        }

    }
}
