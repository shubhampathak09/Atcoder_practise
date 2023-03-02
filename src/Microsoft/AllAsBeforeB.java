package Microsoft;

public class AllAsBeforeB {
    public static  void main(String[] args){
     String s="aaaa";
     int len=s.length();
     int i=0;
     int index=0;
     while(i<len){
      if(s.charAt(i)=='b'){
          index=i;
          break;
      }
      i++;
     }
     while(i<len){
         if(s.charAt(i)=='a')
         {
             System.out.println("All A's Not occure before B");
             return;
         }
         i++;
     }
        System.out.println("All A's occur before B");
     return;
    }
}
