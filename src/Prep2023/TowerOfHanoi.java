package Prep2023;

public class TowerOfHanoi {

    public static int ans=0;

    static public void solve(int n,int source,int destination,int helper){



        if(n == 1){
            System.out.println("Moving the disk"+" "+n + " "+ "from tower"+source+" "+"to tower"+" "+destination+" ");
            ans++;
            return;
        }
        solve(n-1,source,helper,destination);
        System.out.println("Moving the disk " +n+ "from tower"+source+" "+"to tower"+" "+destination);
        ans++;
        solve(n-1,helper,destination,source);
    }

    public static void main(String[] args){


        // input n= 3, tower =3
        int n=3;
        int source=1;
        int destination=3;

        solve(n,1,3,2);

        System.out.println("Total Steps Involved to Move the disks "+ans);
    }

}
