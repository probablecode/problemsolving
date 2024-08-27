import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static int[][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N_M = br.readLine().split(" ");
        int N = Integer.parseInt(N_M[0]);
        int M = Integer.parseInt(N_M[1]);

        memo = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 1; j <= M; j++)
                memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]) + Integer.parseInt(line[j - 1]);
        }
        System.out.println(memo[N][M]);
        br.close();
    }
}