import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N_K = br.readLine().split(" ");
        int N = Integer.parseInt(N_K[0]);
        int K = Integer.parseInt(N_K[1]);
        int[][] memo = new int[K + 1][N + 1];

        int[] W = new int[N + 1];
        int[] V = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            String[] W_V = br.readLine().split(" ");
            W[i] = Integer.parseInt(W_V[0]);
            V[i] = Integer.parseInt(W_V[1]);
        }

        for (int k = 1; k <= K; k++) {
            for (int n = 1; n <= N; n++) {
                int preK = k - W[n];
                int changed = (preK < 0) ? 0 : memo[preK][n - 1] + V[n];
                memo[k][n] = Math.max(changed, memo[k][n - 1]);
            }
        }
        System.out.println(memo[K][N]);
        br.close();
    }
}