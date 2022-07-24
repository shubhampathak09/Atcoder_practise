import java.util.ArrayList;
import java.util.List;

public class Codewars1 {

    public static void main(String[] args){
        List<String> lis = new ArrayList<>();
        lis.add("a");


        List<String> res= new ArrayList<>();

        for(int i=0;i<lis.size();i++){
            String aut="";
            aut+=(i+1)+":"+" "+lis.get(i);
            res.add(aut);
        }


        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
