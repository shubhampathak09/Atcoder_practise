package Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PathFinder {


    public static class node{
        int x;
        int y;
        int w;

        node(int x,int y,int w){
            this.x=x;
            this.y=y;
            this.w=w;
        }
    }

    public static int pathFinder(String maze){
        String a = "000\n"+
                "000\n"+
                "000",

                b = "010\n"+
                        "010\n"+
                        "010",

                c = "010\n"+
                        "101\n"+
                        "010",

                d = "0707\n"+
                        "7070\n"+
                        "0707\n"+
                        "7070",

                e = "700000\n"+
                        "077770\n"+
                        "077770\n"+
                        "077770\n"+
                        "077770\n"+
                        "000007",

                f = "777000\n"+
                        "007000\n"+
                        "007000\n"+
                        "007000\n"+
                        "007000\n"+
                        "007777",

                g = "000000\n"+
                        "000000\n"+
                        "000000\n"+
                        "000010\n"+
                        "000109\n"+
                        "001010";


        String[] s=c.split("\n");

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

        // 0 0 source
        // n-1,n-1 dest


        Queue<node>queue=new LinkedList<>();
        int[] dx={1,0,-1,0};
        int[] dy={0,1,0,-1};

        int destx=s.length-1;
        int desty=s[0].length()-1;
        int ans=0;
        queue.add(new node(0,0,0));
        int[][] vis =new int[s.length][s[0].length()];

        while(!queue.isEmpty())
        {
            node top=queue.peek();
            queue.remove();
            if(top.x == destx && top.y==desty){
                ans=top.w;
                break;
            }
            for(int k=0;k<dx.length;k++){
                if(top.x+dx[k]>=0 && top.x+dx[k]<=destx && top.y+dy[k]>=0  && top.y+dy[k] <= desty && vis[top.x +dx[k]][top.y+dy[k]]==0){
                   queue.add(new node(top.x + dx[k],top.y+dy[k],top.w + Math.abs(s[top.x +dx[k]].charAt(top.y+dy[k])-'0'-s[top.x].charAt(top.y)-'0')));
                    vis[top.x +dx[k]][top.y +dy[k]]=1;
                }
            }
        }

        System.out.println(ans);

   //     System.out.println("height.."+s.length);
   //     System.out.println("width.."+s[0].length());


        return 0;
    }
    public static void main(String[] args){
        pathFinder("cc");
    }
}
