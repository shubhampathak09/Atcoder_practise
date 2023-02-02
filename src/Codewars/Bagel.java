package Codewars;

public class Bagel {
    public final int getValue(){
        return 3;
    }

public class BagelSolver implements BagelSolver.Bagel2 {
        public static Bagel getBagel(){
            return new Bagel();
        }

    @Override
    public int getValue() {
        return 4;
    }

    public interface Bagel2{
            public int getValue();
}
}
public static void main(String[] args){
        Bagel bagel=BagelSolver.getBagel();
    System.out.println(bagel.getValue()==4);
    }
}


