import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static final int MAX = 100001;
    public static int[] dist = new int[MAX];
    public static boolean[] check = new boolean[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        check[X] = true;
        q.add(X);
        while (!q.isEmpty()) {
            int now = q.poll();
            if (now == K)
                break;
            int cur = dist[now];
            int left = now  - 1;
            if (0 <= left && !check[left]) {
                dist[left] = cur + 1;
                check[left] = true;
                q.add(left);
            }
            int right = now + 1;
            if (right < MAX && !check[right]) {
                dist[right] = cur + 1;
                check[right] = true;
                q.add(right);
            }
            int next = now * 2;
            if (next < MAX && !check[next]) {
                dist[next] = cur + 1;
                check[next] = true;
                q.add(next);
            }
        }
        q.clear();
        System.out.println(dist[K]);
    }
}