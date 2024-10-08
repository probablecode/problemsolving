import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static int V;
    public static int E;
    public static int K;

    public static ArrayList<LinkedList<Edge>> adjList;
    public static Queue<Dist> pq = new PriorityQueue<>();
    public static int[] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] V_E = br.readLine().split(" ");
        V = Integer.parseInt(V_E[0]);
        E = Integer.parseInt(V_E[1]);
        K = Integer.parseInt(br.readLine());
        adjList= new ArrayList<>(V + 1);
        distance = new int[V + 1];
        for (int i = 0; i <= V; i++) {
            adjList.add(new LinkedList<>());
            distance[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < E; i++) {
            String[] u_v_w = br.readLine().split(" ");
            int u = Integer.parseInt(u_v_w[0]);
            int v = Integer.parseInt(u_v_w[1]);
            int w = Integer.parseInt(u_v_w[2]);
            adjList.get(u).add(new Edge(v, w));
        }
        distance[K] = 0;
        pq.add(new Dist(K, 0));
        while (!pq.isEmpty()) {
            Dist poll = pq.poll();
            for (Edge e : adjList.get(poll.dst)) {
                if (poll.cost + e.w < distance[e.d]) {
                    distance[e.d] = poll.cost + e.w;
                    pq.add(new Dist(e.d, distance[e.d]));
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            System.out.println(distance[i] == Integer.MAX_VALUE ? "INF" : distance[i]);
        }
        br.close();
    }

    static class Edge {
        int d;
        int w;
        public Edge(int d_, int w_) { d = d_;w = w_;}
    }

    static class Dist implements Comparable {
        int dst;
        int cost;

        public Dist(int d, int c) {
            dst = d;
            cost = c;
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof Dist) {
                if (((Dist)o).cost < this.cost)
                    return 1;
            }
            return -1;
        }
    }
}