package Daily;

public class ArrangeBuildings {

    public static void main(String[] args){

        int n =5;

        int building =1;

        int space =1;


        for(int i=2 ;i<=n;i++){

            int newSpace = building +space;

            int newBuilding = space;

            space = newSpace;

            building = newBuilding;

        }

        int totalOneSide = space + building;

        int total = totalOneSide * totalOneSide;

        System.out.println(total);
    }

}
