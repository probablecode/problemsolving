import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static ArrayList<TreeSet<Integer>> adjList;
    public static int N;
    public static int M;
    public static boolean[] check;
    public static List<Integer> bfsList = new ArrayList<>();
    public static List<Integer> dfsList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N_M_V = br.readLine().split(" ");
        N = Integer.parseInt(N_M_V[0]);
        adjList = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++)
            adjList.add(new TreeSet<>());
        M = Integer.parseInt(N_M_V[1]);
        for (int i = 0; i < M; i++) {
            String[] from_to = br.readLine().split(" ");
            int from = Integer.parseInt(from_to[0]);
            int to = Integer.parseInt(from_to[1]);
            adjList.get(from).add(to);
            adjList.get(to).add(from);
        }
        br.close();
        int V = Integer.parseInt(N_M_V[2]);

        check = new boolean[N + 1];
        check[V] = true;
        dfs(V);
        printQueue(dfsList);
        
        Queue<Integer> bsfQ = new LinkedList<>();
        check = new boolean[N + 1];
        check[V] = true;
        bsfQ.add(V);
        while (!bsfQ.isEmpty()) {
            int poll = bsfQ.poll();
            bfsList.add(poll);
            for (int to : adjList.get(poll)) {
                if (!check[to]) {
                    bsfQ.add(to);
                    check[to] = true;
                }
            }
        }
        printQueue(bfsList);
    }

    private static void printQueue(List<Integer> queue) {
        System.out.print(queue.get(0));
        for (int i = 1; i < queue.size(); i++) {
            System.out.printf(" %d", queue.get(i));
        }
        System.out.println();
    }

    private static void dfs(int v) {
        dfsList.add(v);
        for (int to : adjList.get(v)){
            if (check[to])
                continue;
            check[to] = true;
            dfs(to);
        }
    }
}