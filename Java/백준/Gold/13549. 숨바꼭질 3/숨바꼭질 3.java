import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static int LEN;
    public static int[] dist;
    public static boolean[] check;
    public static Deque<Integer> bfsDQ = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        LEN = 100001;  // Upper bound based on problem constraints
        dist = new int[LEN];
        check = new boolean[LEN];
        
        check[N] = true;
        bfsDQ.addLast(N);
        while (!bfsDQ.isEmpty()) {
            int cur = bfsDQ.pollFirst();
            int curDist = dist[cur];
            if (cur == K) {
                System.out.println(dist[K]);
                break;
            }
            
            int next = cur * 2;
            if (next < LEN && !check[next]) {
                dist[next] = curDist;
                check[next] = true;
                bfsDQ.addFirst(next);
            }
            
            next = cur - 1;
            if (next >= 0 && !check[next]) {
                dist[next] = curDist + 1;
                check[next] = true;
                bfsDQ.addLast(next);
            }
            
            next = cur + 1;
            if (next < LEN && !check[next]) {
                dist[next] = curDist + 1;
                check[next] = true;
                bfsDQ.addLast(next);
            }
        }
    }
}