package Microsoft;

import java.util.Stack;

public class AllOccurencesOfSubstring {

    public static String removeOccurrences(String s, String part) {

        Stack<Character> stk = new Stack();
        int n =s.length();
        int m = part.length();

        for(int i = 0 ;i<n;i++){

            stk.add(s.charAt(i));


            if(stk.size()>=m){


                String l ="";

               for(int j =m-1 ;j>=0;j--){
                   if(part.charAt(j) != stk.peek()){


                       int f=0;

                       while(f!=l.length()){


                           stk.add(l.charAt(f));
                           f++;
                       }
                       break;
                   }
                   else
                   {
                       l =stk.peek() + l;
                       stk.pop();
                   }
               }

            }


        }

        String res ="";
        while(!stk.empty()){
            res = stk.pop() + res;
        }

        return res;
    }


    public static void main(String[] args){



        String S1 = "fffoxoxoxfxo";
        String S2 = "fox";


        String finalVal= removeOccurrences(S1,S2);


        System.out.println(finalVal);
    }
}
