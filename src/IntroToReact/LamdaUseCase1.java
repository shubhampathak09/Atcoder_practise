package IntroToReact;

public class LamdaUseCase1 {
    // method with no parameter, no arguments, no retun type

    public static void main(String[] args){

        FunctionalInterface fun= () -> System.out.println("My Lamda");
        fun.myMethod();


//        public void (int a,int b)
//        {
//
//        }
//
//        public (int a,int b){
//            System.out.println();
//        }
//
//        (int a,int b) -> {
//            // body
//        }
//        (int a,int b) -> {};

        // remove type as well
      //  (a,b) -> {}

    }
    public void operation(int a,int b){
        System.out.println(a+b);
    }


    //ex-2

//    public void myName(){
//        System.out.println("John");
//    }
}
