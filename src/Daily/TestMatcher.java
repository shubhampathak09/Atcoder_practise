package Daily;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {

    public static void main(String[] args){
    Pattern pattern =Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);
    Matcher matcher=pattern.matcher("Visit W3Schools!");
    boolean foundMatch=matcher.find();
        System.out.println( foundMatch == true ? "Pattern Found": "Pattern Not Found");
        String s="abc123xyz";
        /** replace 123 withe one two three **/
               s=s.replaceAll("[123]","OneTwoThree");
        System.out.println(s);
        // replace digts with one two three

        String s1="cat.dog.tree.pool.sugar.";

                /**replace the . with ? **/
        s1=s1.replaceAll("\\.","?");
        System.out.println(s1);
    }




}

/** Match the digits **/
/**
abc123xyz
define "123"
var g = 123
 Pattern [123]
 **/