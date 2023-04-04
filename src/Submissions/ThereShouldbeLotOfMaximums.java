package Submissions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class ThereShouldbeLotOfMaximums {
    /**
     * You are given a tree (a connected graph without cycles). Each vertex of the tree contains an integer.
     * Let's define the MAD
     *  (maximum double) parameter of the tree as the maximum integer that occurs in the vertices of the tree at least 2
     *  times. If no number occurs in the tree more than once, then we assume MAD=0
     * .
     *
     * Note that if you remove an edge from the tree, it splits into two trees. Let's compute the MAD
     *  parameters of the two trees and take the maximum of the two values. Let the result be the value of the deleted edge.
     *
     * For each edge, find its value. Note that we don't actually delete any edges from the tree, the values are to be found independently.
     *
     * Input
     * The first line contains one integer n
     *  (2≤n≤105
     * ) — the number of vertices in the tree.
     *
     * Each of the next n−1
     *  lines contains two integers u
     *  and v
     *  (1≤u,v≤n
     * ) — the ends of an edge of the tree. It's guaranteed that the given edges form a valid tree.
     *
     * The last line contains n
     *  integers a1,a2,…,an
     *  (1≤ai≤109
     * ) — the numbers in the vertices.
     *
     * Output
     * For each edge in the input order, print one number — the maximum of the MAD
     *  parameters of the two trees obtained after removing the given edge from the initial tree.**/


// If something appears at least 3 times, it is usable by every edge
// If something appears <2 times we don't care about it

// For something that appears twice, it's usable everywhere except for that edge

// how to update all of the nodes except those on a path in log(n) time?


// Everything not on the main path will have the main path as the main answer
// We have a path, and every time we take a subset of that path


/*

5
1 2
2 3
2 4
1 5
2 1 3 2 1

 */

    public static class E {

        static boolean DEBUG = false;
        static int globalCounter=1_000_000_00;

        public static void main(String[] args) {
            FastScanner fs=new FastScanner();
            PrintWriter out=new PrintWriter(System.out);
            int n=fs.nextInt();
            Node[] nodes=new Node[n];
            for (int i=0; i<n; i++) nodes[i]=new Node(i+1);
            ArrayList<Edge> edges=new ArrayList<>();
            for (int i=1; i<n; i++) {
                int a=fs.nextInt()-1, b=fs.nextInt()-1;
                Edge e=new Edge(nodes[a], nodes[b]);
                edges.add(e);
                nodes[a].adj.add(e);
                nodes[b].adj.add(e);
            }
            int[] values=fs.readArray(n);
            TreeSet<Integer> ts=new TreeSet<>();
            for (int i:values) ts.add(i);
            ts.add(0);
            HashMap<Integer, Integer> compress=new HashMap<>();
            int[] decomp=new int[ts.size()];
            for (int i:ts) {
                decomp[compress.size()] = i;
                compress.put(i, compress.size());
            }
            for (int i=0; i<values.length; i++) values[i]=compress.get(values[i]);

            int[] nodesWithCount=new int[ts.size()];
            Node[][] nodesWithArr=new Node[2][ts.size()];
            for (int i=0; i<n; i++) {
                if (nodesWithCount[values[i]]<2) {
                    nodesWithArr[nodesWithCount[values[i]]][values[i]]=nodes[i];
                }
                nodesWithCount[values[i]]++;
            }
            int threeMax=0;
            ArrayList<Integer> twoKeys=new ArrayList<>();
            for (int i=0; i<ts.size(); i++) {
                if (nodesWithCount[i]>2) {
                    threeMax=Math.max(i, threeMax);
                }
                else if (nodesWithCount[i]==2) {
                    twoKeys.add(i);
                }
            }
            Collections.sort(twoKeys);
            Collections.reverse(twoKeys);
            if (!twoKeys.isEmpty()) {
                int pair1Ind2=twoKeys.get(0);
                bfs(nodes, nodesWithArr[0][pair1Ind2], null, true);
                ArrayList<Node> path=new ArrayList<>();
                ArrayDeque<Edge> ePath=new ArrayDeque<>();
                Node at=nodesWithArr[1][pair1Ind2];
                while (at!=nodesWithArr[0][pair1Ind2]) {
                    path.add(at);
                    ePath.add(at.from);
                    at=at.from.o(at);
                }
                path.add(nodesWithArr[0][pair1Ind2]);
                // System.out.println("Path is "+path);
                for (Edge e:ePath) {
                    e.inPath=true;
                }
                for (Node nn:nodes) {
                    nn.from=null;
                }
                for (Node nn:path) {
                    nn.onPath=true;
                }

                int curIndexInPath=0;
                for (Node nn:path) {
                    bfs(nodes, nn, nn, false);
                    nn.indexOnPath=curIndexInPath++;
                }
                for (Edge e:edges) {
                    if (!e.inPath) {
                        e.ans=twoKeys.get(0);
                    }
                }
                // for (Node nn:nodes) {
                // 	System.out.println(nn+" "+nn.closestOnPath);
                // }
                for (int twoKeyIndex=1; twoKeyIndex<twoKeys.size(); twoKeyIndex++) {
                    int label=twoKeys.get(twoKeyIndex);
                    Node n1=nodesWithArr[0][label].closestOnPath;
                    Node n2=nodesWithArr[1][label].closestOnPath;
                    // System.out.println("Looking at new path from "+n1+" "+n2);
                    int firstIndex=Math.min(n1.indexOnPath, n2.indexOnPath);
                    int lastIndex=Math.max(n1.indexOnPath, n2.indexOnPath);
                    // System.out.println(firstIndex+" "+lastIndex);
                    while (!ePath.isEmpty() && (ePath.peekFirst().minIndex()<firstIndex || ePath.peekFirst().maxIndex()>lastIndex)) {
                        Edge toUpdate = ePath.removeFirst();
                        toUpdate.ans=Math.max(toUpdate.ans, label);
                        // System.out.println("Removing "+toUpdate);
                    }
                    while (!ePath.isEmpty() && (ePath.peekLast().minIndex()<firstIndex || ePath.peekLast().maxIndex()>lastIndex)) {
                        Edge toUpdate = ePath.removeLast();
                        toUpdate.ans=Math.max(toUpdate.ans, label);
                        // System.out.println("Removing "+toUpdate);
                    }

                }

            }
            for (Edge e:edges) {
                e.ans=Math.max(e.ans, threeMax);
            }
            for (Edge e:edges) {
                out.println(decomp[e.ans]);
            }


            out.close();
        }

        static class Edge {
            Node a, b;
            int ans;
            boolean inPath;
            public Edge(Node a, Node b) {
                this.a=a;
                this.b=b;
            }
            Node o(Node m) {
                return m==a?b:a;
            }
            int minIndex() {
                return Math.min(a.indexOnPath, b.indexOnPath);
            }
            int maxIndex() {
                return Math.max(a.indexOnPath, b.indexOnPath);
            }
            public String toString() {
                return "Edge "+a+" -> "+b;
            }
        }

        static class Node {
            ArrayList<Edge> adj=new ArrayList<>(2);
            Edge from;
            boolean onPath;
            Node closestOnPath;
            int indexOnPath;

            int id;
            public Node(int id) {
                this.id=id;
            }
            public String toString() {
                return "Node "+id;
            }
        }


        static void bfs(Node[] nodes, Node from, Node closestOnPathNode, boolean clear) {
            if (clear) {
                for (Node nn:nodes) {
                    nn.from=null;
                }
            }
            ArrayDeque<Node> bfs=new ArrayDeque<>();
            from.closestOnPath=closestOnPathNode;
            bfs.add(from);
            while (!bfs.isEmpty()) {
                Node cur=bfs.remove();
                for (Edge nnE:cur.adj) {
                    globalCounter--;
                    if (globalCounter<=0) throw null;
                    Node nn=nnE.o(cur);
                    if (nn.onPath) continue;
                    if (nn.from==null && nn!=from) {
                        nn.closestOnPath=closestOnPathNode;
                        nn.from=nnE;
                        bfs.add(nn);
                    }
                }
            }
        }

        static final Random random=new Random();
        static final int mod=1_000_000_007;

        static void ruffleSort(int[] a) {
            int n=a.length;//shuffle, then sort
            for (int i=0; i<n; i++) {
                int oi=random.nextInt(n), temp=a[oi];
                a[oi]=a[i]; a[i]=temp;
            }
            Arrays.sort(a);
        }
        static long add(long a, long b) {
            return (a+b)%mod;
        }
        static long sub(long a, long b) {
            return ((a-b)%mod+mod)%mod;
        }
        static long mul(long a, long b) {
            return (a*b)%mod;
        }
        static long exp(long base, long exp) {
            if (exp==0) return 1;
            long half=exp(base, exp/2);
            if (exp%2==0) return mul(half, half);
            return mul(half, mul(half, base));
        }
        static long[] factorials=new long[2_000_001];
        static long[] invFactorials=new long[2_000_001];
        static void precompFacts() {
            factorials[0]=invFactorials[0]=1;
            for (int i=1; i<factorials.length; i++) factorials[i]=mul(factorials[i-1], i);
            invFactorials[factorials.length-1]=exp(factorials[factorials.length-1], mod-2);
            for (int i=invFactorials.length-2; i>=0; i--)
                invFactorials[i]=mul(invFactorials[i+1], i+1);
        }

        static long nCk(int n, int k) {
            return mul(factorials[n], mul(invFactorials[k], invFactorials[n-k]));
        }

        static void sort(int[] a) {
            ArrayList<Integer> l=new ArrayList<>();
            for (int i:a) l.add(i);
            Collections.sort(l);
            for (int i=0; i<a.length; i++) a[i]=l.get(i);
        }


        static class FastScanner {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer("");
            String next() {
                while (!st.hasMoreTokens())
                    try {
                        st=new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }
            int[] readArray(int n) {
                int[] a=new int[n];
                for (int i=0; i<n; i++) a[i]=nextInt();
                return a;
            }
            long nextLong() {
                return Long.parseLong(next());
            }
        }

    }

}
