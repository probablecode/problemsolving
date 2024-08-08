import java.util.*;

public class Main {
    public static ArrayList<LinkedList<Integer>> adjList;
    public static int[] group;
   
    private static void dfs(int node, int gNum) {
        group[node] = gNum;
        for (int to : adjList.get(node)) {
            if (group[to] == 0)
                dfs(to, 3 - gNum);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            adjList = new ArrayList<>(V + 1);
            group = new int[V + 1];
            for (int j = 0; j <= V; j++) {
                adjList.add(new LinkedList<>());
            }
            for (int j = 0; j < E; j++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
            for (int j = 1; j <= V; j++) {
                if (group[j] == 0)
                    dfs(j,1);
            }
            boolean bipart = true;
            for (int j = 1; j <= V; j++) {
                for (int k : adjList.get(j)) {
                    if (group[j] == group[k]) {
                        bipart = false;
                        break;
                    }
                }
                if (!bipart)
                    break;
            }           
            System.out.println(bipart ? "YES" : "NO");
        }
    }
}