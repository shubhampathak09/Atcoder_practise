package Codewars;

public class ParseInt {
    /**
    In this kata we want to convert a string into an integer.
    The strings simply represent the numbers in words.

    Examples:

            "one" => 1
            "twenty" => 20
            "two hundred forty-six" => 246
            "seven hundred eighty-three thousand nine hundred and nineteen" => 783919
    Additional Notes:

    The minimum number is "zero" (inclusively)
    The maximum number, which must be supported
        is 1 million (inclusively)
    The "and" in e.g. "one hundred and twenty-four"
    is optional,
    in some cases it's present and in others it's not
    All tested numbers are valid,
    you don't need to validate them
    **/


    public static int parseInt(String numStr) {
        numStr=numStr.replaceAll("\\band\\b","");
        String[] strings=numStr.split(" ");

        // 0- 20
        // 30 40 50 60 70 80 90 100
        // thousand
        // 1 million
        // store in hs

        System.out.println(numStr);
        return -1;
    }


    public static void main(String[] args){
       // String input="Print this";
       // String input2="seven hundred eighty-three thousand nine hundred and nineteen";
      //  System.out.println(input2.matches(".*\\band\\b.*"));
      //  System.out.println(input.matches("(?!).*?\\bthis\\b.*?"));
    //    System.out.println(input.matches(".*\\bthis\\b.*"));
        //(?!) ignore case
        //.? any character before
        //b word boundry
        //and expression
        ///b wrod boundary
        //.*? any character after
       parseInt("seven hundred and eighty-three thousand nine hundred and nineteen");
    }
}
