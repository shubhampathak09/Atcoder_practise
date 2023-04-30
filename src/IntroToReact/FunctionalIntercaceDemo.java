package IntroToReact;

public class FunctionalIntercaceDemo {
    public static void main(String[] args){
        FunctionalInterface myInterface =
                () -> System.out.println("hello world");

        myInterface.myMethod();

    }

}
