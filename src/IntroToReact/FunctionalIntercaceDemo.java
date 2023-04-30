package IntroToReact;

public class FunctionalIntercaceDemo {
    public static void main(String[] args){
//        FunctionalInterface myInterface =
//                () -> System.out.println("hello world");
//
//        myInterface.myMethod();

         onTheFly(() -> System.out.println("helloWorld"));
    }

    public static void onTheFly(FunctionalInterface fun){
        fun.myMethod();
    }

}
