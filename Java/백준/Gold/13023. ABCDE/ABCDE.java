import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {

    public static boolean[][] adjMtx;
//    public static LinkedList<Integer>[] adjList;
    public static ArrayList<LinkedList<Integer>> adjList;
    public static Edge[] edgeArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        adjMtx = new boolean[v][v];
        adjList = new ArrayList<LinkedList<Integer>>(v);
        for (int i = 0; i < v; i++)
            adjList.add(new LinkedList<Integer>());
        edgeArray = new Edge[e * 2];
        int edgeCount = 0;

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjMtx[a][b] = true;
            adjMtx[b][a] = true;
            adjList.get(a).add(b);
            adjList.get(b).add(a);
            edgeArray[edgeCount++] = new Edge(a, b);
            edgeArray[edgeCount++] = new Edge(b, a);
        }
        e *= 2;

        for (int i = 0; i < e; i++) {
            for (int j = 0; j < e; j++) {
                if (i == j)
                    continue;
                int A = edgeArray[i].from;
                int B = edgeArray[i].to;

                int C = edgeArray[j].from;
                int D = edgeArray[j].to;
                if (A == C || A == D || B == C || B == D)
                    continue;
                if (!adjMtx[B][C])
                    continue;
                for (int E : adjList.get(D)) {
                    if (A == E || B == E || C == E || D == E)
                        continue;            
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
        return;
    }

    static class Edge {
        public int from;
        public int to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
