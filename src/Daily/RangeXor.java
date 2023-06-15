package Daily;

public class RangeXor {

public static int returnXorOneToN(int n){

    if(n % 4 ==0){
        return n;
    }else if(n % 4 ==1){
        return 1;
    }else if(n % 4 == 2){
        return n+1;
    }else if( n % 4 == 3){
        return 0;
    }

    return -1;
}


public static void main(String[] args){

int xorFive = returnXorOneToN(5);
int xorEight = returnXorOneToN(8);
    System.out.println(xorEight ^ xorFive);


    // 2 foolow up range xor qquery problem



}

}
