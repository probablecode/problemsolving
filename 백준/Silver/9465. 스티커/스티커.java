import java.util.Scanner;
public class Main {
    public static int[][] memo;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            memo = new int[n][3];
            int[] high = new int[n];
            int[] low = new int[n];
            for (int i = 0; i < n; i++)
                high[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                low[i] = sc.nextInt();
            memo[0][1] = high[0];
            memo[0][2] = low[0];
            for (int i = 1; i < n; i++) {
                memo[i][0] = Math.max(Math.max(memo[i - 1][1], memo[i - 1][2]), memo[i - 1][0]);
                memo[i][1] = Math.max(memo[i - 1][0], memo[i - 1][2]) + high[i];
                memo[i][2] = Math.max(memo[i - 1][0], memo[i - 1][1]) + low[i];
            }
            System.out.println(Math.max(memo[n - 1][1], memo[n - 1][2]));
        }
    }
}