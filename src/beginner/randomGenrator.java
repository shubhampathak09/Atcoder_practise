package beginner;

public class randomGenrator {
    static int findRandom(){
        int num = (1 +(int)(Math.random()*100))%2;
        return num;
    }
    static void generateRandomString(int N){
        String s="";
        for(int i=0;i<N;i++){
            int x=findRandom();
            s+=x;
        }
        System.out.println(s);
    }
    public static void  main(String[] args){
        for(int testRun=1;testRun<=100;testRun++)
        generateRandomString(6);
    }
}
