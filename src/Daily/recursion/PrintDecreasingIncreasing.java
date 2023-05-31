package Daily.recursion;

public class PrintDecreasingIncreasing {

    // 3 2 1  1 2 3


    // 4 3 2 1  1 2 3  4


    public static void printDecInc(int n){

        if(n == 0)
            return;

        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }


    public static void main(String[] args){

        printDecInc(4);

    }
}
