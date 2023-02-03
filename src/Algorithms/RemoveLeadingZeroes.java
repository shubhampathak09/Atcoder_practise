package Algorithms;

public class RemoveLeadingZeroes {

    public static void main(String[] args){
        String str="00567789";  //56789
        String strPat="^0+(?!$)";
        str=str.replaceAll(strPat,"");
        System.out.println(str);
    }
}
