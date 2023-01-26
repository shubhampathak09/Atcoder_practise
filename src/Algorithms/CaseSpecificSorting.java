package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class CaseSpecificSorting {
    public static void main(String[] args){

        String str="gEeksfOrgEEkS";

        // l1=EOEES  EEEOS

        // l2=geksfrgk efggkkrs

        // eEf

        StringBuilder s=new StringBuilder(str);

        ArrayList<Character> s1=new ArrayList<>();
        ArrayList<Character>s2=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                s1.add(s.charAt(i));
            }
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                s2.add(s.charAt(i));
            }
            Collections.sort(s1);
            Collections.sort(s2);
        }
        int i=0;
        int j=0;
        for(int k=0;k<s.length();k++)
        {
            if(s.charAt(k)>='a'&&s.charAt(k)<='z'){
                s.setCharAt(k,s1.get(i));
                i++;
            }
            else if(s.charAt(k)>='A'&&s.charAt(k)<='Z'){
                s.setCharAt(k,s2.get(j));
                j++;
            }
        }
        System.out.println(s.toString());  //eEfggkEkrEOsS  eEfggkEkrEOsS
    }
}
