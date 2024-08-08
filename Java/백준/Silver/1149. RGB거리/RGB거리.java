import java.util.*;

public class Main {
    public static int[][] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R, G, B;
        memo = new int[N][3];
        memo[0][0] = sc.nextInt();
        memo[0][1] = sc.nextInt();
        memo[0][2] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            R = sc.nextInt();
            G = sc.nextInt();
            B = sc.nextInt();
            memo[i][0] = Math.min(memo[i - 1][1], memo[i - 1][2]) + R;
            memo[i][1] = Math.min(memo[i - 1][0], memo[i - 1][2]) + G;
            memo[i][2] = Math.min(memo[i - 1][0], memo[i - 1][1]) + B;
        }
        System.out.println(Math.min(Math.min(memo[N - 1][0], memo[N - 1][1]), memo[N - 1][2]));
    }
}