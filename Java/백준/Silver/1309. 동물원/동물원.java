import java.util.*;

public class Main {
    public static final int div = 9901;
    public static int[][] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo = new int[N][3];
        memo[0][0] = memo[0][1] = memo[0][2] = 1;

        for (int i = 1; i < N; i++) {
            memo[i][2] = (memo[i - 1][0] + memo[i - 1][1]) % div;
            memo[i][1] = (memo[i - 1][0] + memo[i - 1][2]) % div;
            memo[i][0] = (memo[i][1] + memo[i][2] - memo[i - 1][0] + div) % div;
        }
        System.out.println((memo[N - 1][0] + memo[N - 1][1] + memo[N - 1][2]) % div);
    }
}