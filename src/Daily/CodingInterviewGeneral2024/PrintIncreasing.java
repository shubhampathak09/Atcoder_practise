package Daily.CodingInterviewGeneral2024;

public class PrintIncreasing {

    public static void main(String[] args){

        printIncreasing(10);

    }

    public static void printIncreasing(int n){

        if(n == 1){
            System.out.println(n);
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }

}
