package Daily;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
static void floddFill(int[][] screen,int m,int n,int x,int y,int prevC,int newC){

    LinkedList<Point>q=new LinkedList<>();
    q.add(new Point(x,y));
    screen[x][y]=newC;
    while(q.size() > 0){
        Point front=q.pop();
        int posx =front.x;
        int posy=front.y;


    }

}
}
