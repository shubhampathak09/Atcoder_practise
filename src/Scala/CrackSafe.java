package Scala;

import java.util.HashSet;
import java.util.Set;

public class CrackSafe {


    public static void dfs(String start,int n,int k,StringBuilder ans,HashSet hs){

        for(int x=0;x<k;x++)
        {

            String val=start + x;
            if(!hs.contains(val))
            {
                hs.add(val);
                dfs(val.substring(1),n,k,ans,hs);
                ans.append(x);
            }
        }
    }

    public static void main(String[] args){

        int n=3;
        int k=3;

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i++){
            sb.append("0");
        }
        String start=sb.toString();

        StringBuilder ans=new StringBuilder();

        HashSet<String>hs=new HashSet<>();

        dfs(start,n,k,ans,hs);



        ans.append(start);

        System.out.println(ans.toString());
    }

}
