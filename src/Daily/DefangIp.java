package Daily;

public class DefangIp {


    public String defangIPaddr(String address) {
        String result ="";
        for(int i=0;i<address.length();i++){
            char c = address.charAt(i);
            if(c == '.'){
                result =result + "[.]";
            }else{
                result+=c;
            }
        }
        return result;
    }


    public int myAtoi(String s) {
        if(s.charAt(0) != '1')
            return Integer.parseInt(s);
        else
            return Integer.parseInt(s.substring(1));
    }

    public String otherWay(String ss){
        //StringBuilder str = new StringBuilder(ss);

       return ss.replace(".","[.]");
    }

}
