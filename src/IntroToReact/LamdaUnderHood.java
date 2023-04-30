package IntroToReact;

public class LamdaUnderHood {

    public static void main(String[] args){

//        FunctionalInterface fun=new FunctionalInterface() {
//            @Override
//            public void myMethod() {
//                System.out.println("implementation 1");
//            }
//        };
//        FunctionalInterface fun1=new FunctionalInterface() {
//            @Override
//            public void myMethod() {
//                System.out.println("implementation 2");
//            }
//        };

     //byte class gone
        FunctionalInterface fun= () -> System.out.println("implementaton 1 -> i am light weight");
        fun.myMethod();
    }
}
