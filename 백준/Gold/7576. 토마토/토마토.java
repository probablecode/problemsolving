import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int[][]box;
    public static int M;
    public static int N;
    public static int total = 0;
    public static int done = 0;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static Queue<Node> bfsQ = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] M_N = br.readLine().split(" ");
        M = Integer.parseInt(M_N[0]);
        N = Integer.parseInt(M_N[1]);
        box = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                int val = Integer.parseInt(line[j]);
                if (val != -1) {
                    total++;
                    if (val == 1) {
                        done++;
                        bfsQ.add(new Node(i, j, 0));
                    }
                }
                box[i][j] = val;
            }
        }
        br.close();
        if (done == total) {
            System.out.println(0);
            return;
        }

        while (!bfsQ.isEmpty()) {
            Node cur = bfsQ.poll();
            int n = cur.n;
            int m = cur.m;
            int day = cur.day;
            for (int i = 0; i < 4; i++) {
                int nx = m + dx[i];
                int ny = n + dy[i];
                if (0 <= nx && nx < M && 0 <= ny && ny < N && box[ny][nx] == 0) {
                    done++;
                    if (done == total) {
                        System.out.println(day + 1);
                        return;
                    }
                    box[ny][nx] = 1;
                    bfsQ.add(new Node(ny, nx, day + 1));
//                    print();
//                    System.out.println("---------------------------------------------");
//                    System.out.println(bfsQ);
//                    System.out.println("---------------------------------------------");
                }
            }
        }
        System.out.println(-1);
    }

    static class Node {
        public Node(int n, int m, int day) {
            this.n = n;
            this.m = m;
            this.day = day;
        }

        int n;
        int m;
        int day;

//        @Override
//        public String toString() {
//            return String.format("{(%d, %d) : %d}", n, m, day);
//        }
    }

//    private static void print() {
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(box[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
