public class StringToInteger {


    public static int myAtoi(String s) {

        int foo=0;
        int i=0;
        boolean isNeg=false;

        while(s.charAt(i)==' '){
            i++;
        }

        if(s.charAt(i)=='-'){
            isNeg=true;
            i++;
        }

        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i)))
            {
                break;
            }
            foo=foo*10;
            foo+=s.charAt(i)-'0';
            i++;
        }
        if(isNeg){
            foo=-1*foo;
        }
        return foo;
    }

    public static void main(String[] args){

        String s=" 0032";

        //System.out.println(Integer.parseInt(s));
        int foo;

        try
        {
            foo=Integer.parseInt(s);
            System.out.println(foo);
        }catch(NumberFormatException e)
        {
            foo=0;
            System.out.println(foo);
           // e.printStackTrace();

        }
        System.out.println(myAtoi(
                "4193 with words"));
    }

}
