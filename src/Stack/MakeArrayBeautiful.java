package Stack;


import java.util.ArrayList;

public class MakeArrayBeautiful {
    public static void main(String[] args){
        int[] arr= {45,67,1};
        ArrayList<Integer>l=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(l.size()!=0 && l.get(l.size()-1)<0 && arr[i] >= 0 && l.size()!=0 &&  l.get(l.size()-1) >= 0 && arr[i]<0){
                l.remove(l.size()-1);
            }else
            {
                l.add(arr[i]);
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }

}
