package Algorithms;

public class AddFractions {

    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else if(b==a)
            return 1;
        else if(b>a)
            return gcd(b,a);
        else
            return gcd(b,a%b);
    }
    public static void lowest(int num,int den){
        int gcd1=gcd(num,den);
        num=num/gcd1;
         den=den/gcd1;
        System.out.println(num + " /" +" "+den);

    }

    public static void add(int nr1,int dr1,int nr2,int dr2){
        int cde=gcd(dr1,dr2);
        cde= (dr1*dr2)/cde;

        int cnr = (nr1 * (cde/dr1)) + (nr2*(cde/dr2));
        lowest(cnr,cde);
        //System.out.println("Fraction in unreduced form :- "+ cnr + "/"+ " "+cde);
    }

    public static void main(String[] args){
     //   System.out.println(gcd(252,63));// 1/5 + 3/15  = 5/6

        add(1,5,3,15);  //5/6

    }
}
