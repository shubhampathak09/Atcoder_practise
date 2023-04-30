package IntroToReact;

public class LamdaExample4 {

    public int length(String s){
        int l=s.length();
        System.out.println("Length is "+l);
        return l;
    }

//    s -> {
//        int l=s.length();
//        System.out.println();
//        return l;
//    }



    public static void main(String[] args){
        LengthOfString2 len= s -> {
            int l=s.length();
            System.out.println("The length of String is.."+l);
            return l;
        };
        int len1=len.len("ShubhamPathak");
        System.out.println(len1);
    }

}
