package IntroToReact;

public class LamdaUsecase2 {

    public static void main(String[] args){
    MathOperation addOperation= (a,b) ->
        System.out.println(a+b);

    addOperation.operation(2,3);


    MathOperation mulOperation = (a,b) -> System.out.println(a * b);

    mulOperation.operation(2,3);

    }

}
