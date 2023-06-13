package Daily;

public class Permutations {


    public static String swap(String a, int i,int j){
        char temp;
        char[] tempArray = a.toCharArray();
        temp=tempArray[i];
        tempArray[i] =  tempArray[j];
        tempArray[j] = temp;
        return new String(tempArray);
    }
    public static void permute(String s,int l,int r){
        if(l == r)
        {
            System.out.println(s);
        }else{
            for(int i= l ;i<=r ;i++){
                s = swap(s,l,i);
                permute(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }

    public static void main(String[] args){
        String str="abcd";
        int n=str.length();
        permute(str,0,n-1);
    }
}
