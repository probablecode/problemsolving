import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static final int MAX = 1000001;
    public static int[][] inputs;
    public static int[][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        inputs = new int[N][3];
        memo = new int[N][3];

        int min = MAX;
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < 3; j++)
                inputs[i][j] = Integer.parseInt(split[j]);
        }
        for (int a = 0; a < 3; a++) {
            for (int i = 0; i < 3; i++)
                memo[0][i] = (a == i ? inputs[0][i] : MAX);
            for (int i = 1; i < N; i++) {
                memo[i][0] = Math.min(memo[i - 1][1], memo[i - 1][2]) + inputs[i][0];
                memo[i][1] = Math.min(memo[i - 1][2], memo[i - 1][0]) + inputs[i][1];
                memo[i][2] = Math.min(memo[i - 1][0], memo[i - 1][1]) + inputs[i][2];
            }
            for (int i = 0; i < 3; i++) {
                if (a == i) continue;
                min = Math.min(memo[N - 1][i], min);
            }
        }
        System.out.println(min);
    }
}