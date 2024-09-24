import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static int T;
    public static int LEN;
    public static int map[][];
    public static int dx[] = {1, 2, 2, 1, -1, -2, -2, -1};
    public static int dy[] = {2, 1, -1, -2, -2, -1, 1, 2};

    public static boolean check[][];
    public static Queue<Pos> bfsQ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            LEN = sc.nextInt();
            map = new int[LEN][LEN];
            check = new boolean[LEN][LEN];
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            if (x0 == x1 && y0 == y1) {
                System.out.println(0);
                continue;
            }
            bfsQ = new LinkedList<>();
            bfsQ.add(new Pos(x0, y0));
            check[x0][y0] = true;
            boolean flag = false;
            while (!bfsQ.isEmpty() && !flag) {
                Pos pos = bfsQ.poll();
                int x = pos.x;
                int y = pos.y;
                int dist = map[x][y];
                for (int k = 0; k < 8; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (0 <= nx && nx < LEN && 0 <= ny && ny < LEN && !check[nx][ny]) {
                        if (nx == x1 && ny == y1) {
                            flag = true;
                            System.out.println(dist + 1);
                            break;
                        }
                        check[nx][ny] = true;
                        map[nx][ny] = dist + 1;
                        bfsQ.add(new Pos(nx, ny));
                    }
                }
            }
        }

    }
    static class Pos {
        public Pos(int x_, int y_) {
            x = x_;
            y = y_;
        }
        int x;
        int y;
    }
}