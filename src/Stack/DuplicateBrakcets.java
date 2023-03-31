package Stack;

import java.util.Stack;

public class DuplicateBrakcets {

    public static boolean check(String str){
     // ( ,a,b,c,d -> push
     // ) -> peek  ( no conten retur true ppek until (
     // pop

        Stack<Character> s =new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
             if(s.peek()=='('){
                 System.out.println("duplicate brackets present");
                 return true;
             }else{
                 while(s.peek()!='('){
                     s.pop();
                 }s.pop();
             }
            }else
            {
             s.push(ch);
            }
        }
        System.out.println("no duplicates");
        return false;
    }

    public static void main(String[] args){

     String s="(a+b)+(c+d)";
        System.out.println(check(s));
    }
}
