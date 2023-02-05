package Algorithms;

public class AddSqIntegers {

    public static String add(int n){
        String s="";
        
        while(n> 0){
           int d=n%10;
           s+=(d*d);
           n=n/10;
        }
    //    String ss= new StringBuilder(s).reverse().toString();
        return s;
    }

    public static void main(String[] args){
        System.out.println(add(9119));
    }
}
