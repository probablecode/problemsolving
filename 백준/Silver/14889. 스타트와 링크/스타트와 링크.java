import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        int len = N / 2;
        int[][] s = new int[N][N];
        int[] head = new int[N];
        int[] tail = new int[N];

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                s[i][j] = Integer.parseInt(split[j]);
            }
        }

        int h, t;

        for (int i = 0; i < 1 << (N - 1); i++) {
            h = 0;
            t = 0;
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) == 1 << j)
                    head[h++] = j;
                else
                    tail[t++] = j;
            }
            if (h != len || t != len)
                continue;

            int hSum = 0;
            int tSum = 0;
            for (int j = 0; j < len; j++) {
                int h0 = head[j];
                int t0 = tail[j];
                for (int k = j + 1; k < len; k++) {
                    int h1 = head[k];
                    int t1 = tail[k];
                    hSum += (s[h1][h0] + s[h0][h1]);
                    tSum += (s[t1][t0] + s[t0][t1]);
                }
            }
            min = Math.min(min, Math.abs(hSum - tSum));
        }
        System.out.println(min);
        br.close();
    }
}