package Codewars;

import java.util.ArrayList;

public class GreenNumbers {


    public static boolean isGreenNumber(int n){
        int i =n;
        int sq = n*n;
        while(i>0){
            if(i % 10 !=sq%10){
                return false;
            }
            i=i/10;
            sq=sq/10;

        }
        return true;
    }

    public static boolean checkEnd(long a,int b){
        String s1 =String.valueOf(a);
        String s2= String.valueOf(b);

        if(s1.length() <s2.length()){
            return false;
        }
        int n1=s1.length();
        int n2=s2.length();

        for(int i=0;i<n2;i++){
            if(s1.charAt(n1-i-1)!=s2.charAt(n2-i-1)){
                return false;
            }
        }

        return true;
    }


   static int getGreenNumber(int n, ArrayList<Integer> arrayList){
        return arrayList.get(n-1);
    }

    static ArrayList<Integer> genGreenNumbers(int n){
        ArrayList<Integer>res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            long sqNumber = i * i;
            if(isGreenNumber(i) == true){
                res.add(i);
            }
        }

        for(Integer x : res){
            System.out.println(x);
        }

        return res;
    }

    public static void main(String[] args){


        int n=5000;

        genGreenNumbers(n);
    }
}
