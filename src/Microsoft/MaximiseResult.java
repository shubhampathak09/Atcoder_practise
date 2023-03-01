package Microsoft;

public class MaximiseResult {
   /** https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/  **/

   public String removeDigit(String number,char digit){

       int index=-1;
       for(int i=0;i<number.length();i++){
           if(number.charAt(i)==digit && number.charAt(i) - '0' < number.charAt(i+1) -'0'){
               index =i;
               break;
           }
       }
       if(index ==-1){
           for(int i=number.length()-1;i>=0;i--){
               if(number.charAt(i)==digit){
                   index=i;
                   break;
               }
           }
       }

       String ans="";
       for(int i=0;i<number.length();i++){
           if(i!=index){
               ans+=number.charAt(i);
           }
       }
       return ans;
   }

    public static void main(String[] args){

       String  number="123";
       char digit='3';


    }
}
