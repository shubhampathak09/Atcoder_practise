package Codewars;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBalancedParanthesis {

    public static void gen(int open,int close,StringBuilder sb,int n,List<String>res){
        if(open==n && close==n){
            res.add(sb.toString());
            return;
        }
        if(open < n){
            int newop=open+1;
            StringBuilder nsb= new StringBuilder(sb);
            nsb.append("(");
            gen(newop,close,nsb,n,res);
        }
        if(open > close){
            int newclose=close+1;
            StringBuilder nsb=new StringBuilder(sb);
            nsb.append(")");
            gen(open,newclose,nsb,n,res);
        }
    }

    public static List<String> balancedParens (int n) {
        // your code here
        List<String> res=new ArrayList<>();
        if(n==0)
        {
           res.add("");
            return res;
        }
        int open=0;
        int close=0;
        StringBuilder sb=new StringBuilder("");
        gen(open,close,sb,n,res);
        return res;
    }

    public static void main(String[] args){
           //   StringBuilder sb=new StringBuilder("");
               List<String>res1=new ArrayList<>();
               res1=balancedParens(2);
        System.out.println(res1);
    }
    /**https://www.codewars.com/kata/5426d7a2c2c7784365000783/solutions/java**/
    /**https://www.codewars.com/kata/5426d7a2c2c7784365000783/solutions/java**/
}
