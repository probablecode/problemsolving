import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int N;
    public static int[][] map;
    public static int[] head;
    public static int[] tail;

    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        head = new int[N / 2];
        tail = new int[N / 2];

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(split[j]);
        }

        go(0, 0, 0);
        System.out.println(min);
        br.close();
    }

    private static void go(int h, int t, int idx) {
        if (h == N / 2) {
            for (int i = t; i < N / 2; i++)
                tail[i] = idx++;
            min = Math.min(min, solve());
            return;
        }
        else if (t == N / 2) {
            for (int i = h; i < N / 2; i++)
                head[i] = idx++;
            min = Math.min(min, solve());
            return;
        }

        head[h] = idx;
        go(h + 1, t,idx + 1);
        tail[t] = idx;
        go(h, t + 1, idx + 1);
    }

    private static int solve() {
        int hScore = 0, tScore = 0;

        for (int i = 0; i < N/2; i++) {
            int h0 = head[i];
            int t0 = tail[i];
            for (int j = i + 1; j < N/2; j++) {
                int h1 = head[j];
                int t1 = tail[j];
                hScore += (map[h0][h1] + map[h1][h0]);
                tScore += (map[t0][t1] + map[t1][t0]);
            }
        }
        return Math.abs(hScore - tScore);
    }
}