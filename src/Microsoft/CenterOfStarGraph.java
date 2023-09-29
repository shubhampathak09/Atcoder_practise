package Microsoft;

public class CenterOfStarGraph {


    /**
     *  https://leetcode.com/problems/find-center-of-star-graph/
     */

    public static int findCenter(int[][] edges) {

        int e= edges.length;
        int v =e+1;
      //  System.out.println(n);
        int[] cntArray = new int[v+1];

   //     System.out.println(cntArray.length);
        for(int i =0 ;i<edges.length;i++){
  //          System.out.println(edges[i][0]);
  //          System.out.println(edges[i][1]);
          int[] cr = edges[i];
          //System.out.println("Current edge.." + cr[0] +"-" +cr[1]);
          cntArray[cr[0]]++;
          cntArray[cr[1]]++;
        }
        for(int i =1 ;i<=v;i++){
            if(cntArray[i]==v-1){
    //            System.out.println(cntArray[i]);
                return cntArray[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){


        int[][] edges = {{1,2},{2,3},{4,2}};
        int center = findCenter(edges);
        int actualVertex = center-1;

        System.out.println(actualVertex);
    }

}
