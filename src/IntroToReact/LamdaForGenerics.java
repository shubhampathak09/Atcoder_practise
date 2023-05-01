package IntroToReact;

public class LamdaForGenerics {

    public static void main(String[] args){

        FunctionalGeneerics<String,String> fun =
        s -> s.substring(1,5);
        System.out.println(fun.exectue("ShubhamPathak"));

       FunctionalGeneerics<String,Integer> fun1
               = s -> s.length();


        System.out.println(fun1.exectue("ShubhamPathak"));




    }
}
