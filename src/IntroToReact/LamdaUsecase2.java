package IntroToReact;

public class LamdaUsecase2 {

    public static void main(String[] args){
    MathOperation operation= (a,b) ->
        System.out.println(a+b);

    operation.operation(2,3);
    }

}
