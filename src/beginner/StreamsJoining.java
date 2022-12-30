package beginner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJoining {

    public static String smash(String ...words){
        return Stream.of(words).collect(Collectors.joining(" "));
    }

public static void main(String[] args){

    System.out.println(smash(new String[]{"Hello","World","And Happy new Year 2023"}));
     
}
}

