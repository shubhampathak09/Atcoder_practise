package Algorithms;

import java.lang.reflect.Field;

public class FieldAccessible {
    public static class MyClass{
        private String theField;

    }
    public static void main(String[] arg) throws Exception{
        MyClass myClass=new MyClass();
        Field field1=myClass.getClass().getDeclaredField("theField");
        field1.setAccessible(true);
        System.out.println(field1.get(myClass));
        Field field2=myClass.getClass().getDeclaredField("theField");
        System.out.println(field2.get(myClass));
    }
}
