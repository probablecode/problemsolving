import java.util.*;

public class Main {


    public static ArrayList<TreeSet<Integer>> adjList;
    public static boolean[] checked;

    public static List<Integer> dfsList = new ArrayList<Integer>();
    public static List<Integer> bfsList = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        adjList = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            adjList.add(new TreeSet<>());
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }


        checked = new boolean[N + 1];
        dfs(V);

        checked = new boolean[N + 1];
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(V);
        checked[V] = true;
        while (!bfsQueue.isEmpty()) {
            Integer poll = bfsQueue.poll();
            bfsList.add(poll);

            for (int to : adjList.get(poll)) {
                if (checked[to]) {
                    continue;
                }
                bfsQueue.add(to);
                checked[to] = true;
            }
        }

        System.out.print(V);
        for (int i = 1; i < dfsList.size(); i++)
            System.out.printf(" %d", dfsList.get(i));
        System.out.println();
        System.out.print(V);

        for (int i = 1; i < bfsList.size(); i++)
            System.out.printf(" %d", bfsList.get(i));
        System.out.println();
    }

    private static void dfs(int v) {
        if (checked[v])
            return;
        dfsList.add(v);
        checked[v] = true;

        for (int to :  adjList.get(v))
            dfs(to);
    }
}
