package Daily;

import java.util.ArrayList;

public class PhonePadKeyPad {


    static String[] codes ={".;",
            "abc",
            "def","ghi",
            "jkl","mno",
            "pqrs",
            "tu",
            "vwx",
            "yz"};

    public static void main(String[] args){

    }



    public static ArrayList<String> getKPC(String str){


        if(str.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch =str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String>res= getKPC(ros);
        ArrayList<String>mres = new ArrayList<>();

        String codeforch=codes[ch-'0'];
       for(int i=0;i<codeforch.length();i++)
       {
           char chcode=codeforch.charAt(i);
           for(String rstr : mres){
               mres.add(chcode + rstr);
           }
       }
       return mres;


        //return null;
    }
}
