package Algorithms;

public class AddingBigIntegers {
    public static String sum(String s1,String s2){

        /** remove leading zeroes **/
        String strPat="^0+(?!$)";
        s1=s1.replaceAll(strPat,"");
        s2=s2.replaceAll(strPat,"");
        if(s1.length() > s2.length()){
            String t=s1;
            s1=s2;
            s2=t;
        }
        int n1=s1.length();
        int n2=s2.length();
        s1=new StringBuilder(s1).reverse().toString();
        s2=new StringBuilder(s2).reverse().toString();
        int carry=0;
        String str="";

        for(int i=0;i<n1;i++){
           int sum= (int)s1.charAt(i) -'0' + (int)s2.charAt(i)-'0' +carry;
           str+=(char)(sum % 10 +'0');
           carry=sum/10;
        }
        for(int i=n1;i<n2;i++){
            int sum=(int)s2.charAt(i) -'0' +carry;
            str+=(char)(sum % 10 + '0');
            carry=sum/10;
        }
        if(carry>0){
            str+=(char)(carry +'0');
        }
        str =new StringBuilder(str).reverse().toString();
        return str;
    }
    public static void main(String[] args){
        System.out.println(sum("122","2"));
        System.out.println(sum("499","190"));
        System.out.println(sum("382304817375","05061194457325792"));
      //  382304817375 + 05061194457325792 ==> expected: <5061576762143167> but was: <05061576762143167>
        //app2 w/0 regx return f.charAt(0) == '0' && f.length() > 1 ? f.substring(1, f.length()) : f; can use this logic
    }
}
