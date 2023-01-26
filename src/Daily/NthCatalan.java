package Daily;

public class NthCatalan {
    // cn+1 = c0cn + c1cn-1 +c2cn-2+..cnc0


    public static int catalan(int n){
        int res =0;
        if(n<=1)
            return 1;
        for(int i=0;i<n;i++){
            res+=catalan(i)*catalan(n-i-1);
        }
        return res;
    }
    public static void main(String[] args){
     for(int i=0;i<10;i++){
         System.out.println(catalan(i));
     }
     /** cataln numbers recursive approach **/
     
    }
}
