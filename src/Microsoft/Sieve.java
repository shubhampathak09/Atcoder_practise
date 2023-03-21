package Microsoft;

public class Sieve {
static boolean[] prime;
static void sieveOf(int n){
    prime=new boolean[n+1];
    for(int i=0;i<=n;i++)
    {
        prime[i]=true;
    }
    for(int p=2;p*p<=n;p++){
        if(prime[p]==true){
            for(int i=p*p ;i<=n;i+=p){
                prime[i]=false;
            }
        }
    }



}
    public static void main(String[] args){
       sieveOf(100);
       int pi=64;
       double sq=Math.sqrt(pi);
       if(sq * sq == pi && prime[(int)sq]==true){
           System.out.println("3 prime");
       }else
           System.out.println("not 3 prime");
    }
}
