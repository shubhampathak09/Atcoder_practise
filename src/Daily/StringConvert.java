package Daily;

public class StringConvert {


    public static int getLucky(String s, int k) {
        String numRep = "";

        for (int i = 0; i < s.length(); i++) {
            int y = s.charAt(i) - 'a' + 1;
            numRep += y;
        }

        System.out.println(numRep);


        int sum =0;
        while(k>0){
            for(int i=0 ;i< numRep.length();i++){
                int x = numRep.charAt(i) - '0';
                sum+=x;
            }
            String newS ="" + sum;
            numRep= newS;
            sum =0;
            k--;
        }

        int num =0;
        for(int i =0 ;i<numRep.length() ;i++){

            num = num * 10 + numRep.charAt(i) -'0';
        }

        return num;
    }

    public static void main(String[] args){
     int a =   getLucky("zbax",2);

        System.out.println(a);
    }
}
