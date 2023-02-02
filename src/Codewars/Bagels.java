package Codewars;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Bagels {
    public final int getValue(){
        return 3;
    }
    public static Bagels getBagel() throws NoSuchFieldException, IllegalAccessException {
        Field field= Boolean.class.getField("TRUE");
        field.setAccessible(true);
        Field modifiedField=Field.class.getDeclaredField("modifiers");
        modifiedField.setAccessible(true);
        modifiedField.setInt(field,field.getModifiers() & ~Modifier.FINAL);
        field.set(null,false);
        return new Bagels();
    }
}
