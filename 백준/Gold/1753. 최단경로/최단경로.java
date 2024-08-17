import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static final int MAX = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V, E, K;
        String[] V_E = br.readLine().split(" ");
        V = Integer.parseInt(V_E[0]);
        E = Integer.parseInt(V_E[1]);
        K = Integer.parseInt(br.readLine());
        ArrayList<LinkedList<Edge>> adjList = new ArrayList<>(V);
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = MAX;
            adjList.add(new LinkedList<>());
        }
        for (int i = 0; i < E; i++) {
            String[] u_v_w = br.readLine().split(" ");
            int u = Integer.parseInt(u_v_w[0]) - 1;
            int v = Integer.parseInt(u_v_w[1]) - 1;
            int w = Integer.parseInt(u_v_w[2]);
            adjList.get(u).add(new Edge(v, w));
        }
        Queue<Dist> pq = new PriorityQueue<>();
        dist[K - 1] = 0;
        pq.add(new Dist(0, K - 1));
        while (!pq.isEmpty()) {
            Dist d = pq.poll();
            int base = d.cost;
            for (Edge e : adjList.get(d.dst)) {
                int update = base + e.weight;
                if (update < dist[e.to]) {
                    dist[e.to] = update;
                    pq.add(new Dist(update, e.to));
                }
            }
        }

        for (int i = 0; i < V; i++)
            System.out.println(dist[i] == MAX ? "INF" : dist[i]);
        br.close();
    }

    static class Edge {
        public Edge(int t, int w) { this.to = t; this.weight = w; }
        int to;
        int weight;
    }

    static class Dist implements Comparable<Dist> {
        public Dist(int c, int d) {cost = c; dst = d;}
        int cost;
        int dst;

        @Override
        public int compareTo(Dist o) {
            if (this.cost > o.cost)
                return 1;
            else if (this.cost < o.cost)
                return -1;
            return 0;
        }
    }
}