package beginner;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        // Program me!
        char c=name.charAt(0);
        if(c=='r'||c=='R')
            return name + " plays banjo" ;
        else
            return name + " does not play banjo";
    }

}



