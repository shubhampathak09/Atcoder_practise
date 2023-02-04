package Daily;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {

    public static void main(String[] args){
    Pattern pattern =Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);
    Matcher matcher=pattern.matcher("Visit W3Schools!");
    boolean foundMatch=matcher.find();
        System.out.println( foundMatch == true ? "Pattern Found": "Pattern Not Found");
    }
}
