package Daily;

import scala.concurrent.impl.FutureConvertersImpl;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {


    static boolean isValid(int[][] screen, int m, int n, int x, int y, int prevC, int newC) {
        if (x < 0 || x >= m || y < 0 || y >= n)
            return false;
        else
            return true;
    }

    static void floddFill(int[][] screen, int m, int n, int x, int y, int prevC, int newC) {

        LinkedList<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        screen[x][y] = newC;
        while (q.size() > 0) {
            Point front = q.pop();
            int posx = front.x;
            int posy = front.y;
            if (isValid(screen, m, n, posx + 1, posy, prevC, newC)) {
                screen[posx + 1][posy] = newC;
                q.add(new Point(posx + 1, posy));
            }
            if (isValid(screen, m, n, posx, posy + 1, prevC, newC)) {
                screen[posx][posy + 1] = newC;
                q.add(new Point(posx, posy + 1));
            }
            if (isValid(screen, m, n, posx - 1, posy, prevC, newC)) {
                screen[posx - 1][posy] = newC;
                q.add(new Point(posx - 1, posy));
            }
            if (isValid(screen, m, n, posx, posy - 1, prevC, newC)) {
                screen[posx][posy - 1] = newC;
                q.add(new Point(posx, posy - 1));
            }
        }

    }

    public static void main(String[] args) {
        int[][] screen = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}};
        int m = screen.length;
        int n = screen[0].length;

        int x = 4;
        int y = 4;
        int prevC = screen[x][y];
        int newC = 3;

        // Printing the updated screen
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(screen[i][j] + " ");
            }
            System.out.println();
        }

    }
}
