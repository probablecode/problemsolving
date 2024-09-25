import java.util.Scanner;

public class Main {
    public static long[][] memo = new long[11][2001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2000; i++) {
            memo[1][i] = 1;
        }
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <= 2000; j++) {
                for (int k = j * 2; k <= 2000; k++)
                    memo[i + 1][k] += memo[i][j];
            }
        }


        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long answer = 0;
            for (int k = 1; k <= m; k++)
                answer += memo[n][k];
            System.out.println(answer);
        }
    }
}