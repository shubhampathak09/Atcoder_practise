public class StringToInteger {

    public static void main(String[] args){

        String s=null;

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

    }

}
