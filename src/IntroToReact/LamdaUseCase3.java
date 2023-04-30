package IntroToReact;

public class LamdaUseCase3 {
    // Lamda impl return type


    public int length(String s){
        return s.length();
    }

//
//    public int(String s){
//        return s.length();
//
//
//    }
//
//    public(String s){
//        return s.length()
//    }
//    (String s){
//        return s.length();
//    }
//
//    (String s) -> {return s.length()};
//    (String s) -> return s.length();
//
//    (s) -> return s.length();
//
//    (s) -> s.length();
//
//    s -> s.length();


    public static void main(String[] args) {
        LengthOfString len = s -> s.length();
        System.out.println(len.length("ShubhamPathak"));
    }

}
