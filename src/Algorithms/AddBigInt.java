package Algorithms;

import java.math.BigInteger;

public  class AddBigInt {
    public static String add(String a, String b) {
      BigInteger  l1 =new BigInteger(a);
      BigInteger l2=new BigInteger(b);
      BigInteger l3=l1.add(l2);
      return String.valueOf(l3);
    }
    public static void main(String[] args){
        System.out.println(add("123","321"));
    }
}
