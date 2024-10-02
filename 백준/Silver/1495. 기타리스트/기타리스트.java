import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N_S_M = br.readLine().split(" ");

        int N = Integer.parseInt(N_S_M[0]);
        int S = Integer.parseInt(N_S_M[1]);
        int M = Integer.parseInt(N_S_M[2]);
        int[] V = new int[N];
        String[] volumes = br.readLine().split(" ");
        br.close();
        for (int i = 0; i < N; i++)
            V[i] = Integer.parseInt(volumes[i]);
        boolean[][] m = new boolean[N + 1][M + 1];
        m[0][S] = true;
        for (int i = 0; i < N; i++) {
            boolean fail = true;
            for (int j = 0; j <= M; j++) {
                if (!m[i][j])
                    continue;
                if (0 <= j - V[i]) {
                    m[i + 1][j - V[i]] = true;
                    fail = false;
                }
                if (j + V[i] <= M) {
                    m[i + 1][j + V[i]] = true;
                    fail = false;
                }
            }
            if (fail) {
                System.out.println(-1);
                return;
            }
        }
        for (int i = M ; 0 <= i; i--) {
            if (m[N][i])
            {
                System.out.println(i);
                return;
            }
        }
    }
}