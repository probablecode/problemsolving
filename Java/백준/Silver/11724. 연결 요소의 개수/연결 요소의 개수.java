import java.util.*;
public class Main {
    public static ArrayList<LinkedList<Integer>> adjList;
    public static HashSet<Integer> unchecked = new HashSet<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        adjList = new ArrayList<>(N + 1);
        adjList.add(new LinkedList<>());
        for (int i = 1; i <= N; i++) {
            adjList.add(new LinkedList<>());
            unchecked.add(i);
        }
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        int component = 0;
        while (!unchecked.isEmpty()) {
            int first = unchecked.iterator().next();
            component++;
            dfs(first);
        }
        System.out.println(component);
    }

    private static void dfs(int node) {
        if (!unchecked.contains(node))
            return;
        unchecked.remove(node);
        for (int to : adjList.get(node))
            dfs(to);
    }
}