package Daily;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean checkAnagram(String s1,String s2) {


        char tempArray1[] = s1.toCharArray();
        char tempArray2[] = s2.toCharArray();

        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);


        String ss1 = new String(tempArray1);
        String ss2 = new String(tempArray2);
        return ss1.equals(ss2);
    }
    public static void main(String args[])
    {
      // test code here

        String s1="shubham";
        String s2="mahbuhs";

        System.out.println(checkAnagram(s1,s2));
    }

}
