package Daily;

public class DecodedString {


    public static void main(String[] args){

        String s ="leet2code3";

        int n=s.length();

        String finalStr="";

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int time =s.charAt(i)-'0';
                String temp = s.substring(0,i);
                for(int j=0;i<time;j++){
                    finalStr+=temp;
                }
            }else
            {
                       finalStr+=s.charAt(i);
            }
        }

        System.out.println(finalStr);
    }

}
