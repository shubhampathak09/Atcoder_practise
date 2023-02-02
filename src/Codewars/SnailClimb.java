package Codewars;

public class SnailClimb {
    public static int snail(int column, int day, int night) {
        int days=0;
        while(column >= 0){
            days++;
            column=column-day;

            if(column<=0){
                break;
            }else
            {
                // spend night
                column=column+night;
            }
        }
        return days;
    }
    public static void main(String[] args){
        System.out.println(snail(70,94,86));
        System.out.println(snail(10,3,1));
        System.out.println(snail(10,3,2));
        System.out.println(snail(100,20,5));
    }

}
