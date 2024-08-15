import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int[][]dist;
    public static boolean[][]check;
    public static Queue<Integer> bfsQ = new LinkedList<>();
    public static final int LEN = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        dist = new int[LEN][LEN];
        check = new boolean[LEN][LEN];

        check[1][0] = true;
        bfsQ.add(LEN);
        while (!bfsQ.isEmpty()) {
            int poll = bfsQ.poll();
            int screen = poll / LEN;
            int board = poll % LEN;
            int cur = dist[screen][board];

            if (screen == S) {
                System.out.println(dist[S][board]);
                break;
            }
            move(screen, screen, cur + 1);
            if (0 < board && screen + board < LEN)
                move(screen + board, board, cur + 1);
            if (0 < screen)
                move(screen - 1, board, cur + 1);
        }
    }

    private static void move(int screen, int board, int cost) {
        if (!check[screen][board]) {
            check[screen][board] = true;
            dist[screen][board] = cost;
            bfsQ.add(screen * LEN + board);
        }
    }
}