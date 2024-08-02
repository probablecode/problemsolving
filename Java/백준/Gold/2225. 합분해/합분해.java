import java.util.Scanner;
public class Main {
    public static final int div = 1000000000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] map = new int[K][N + 1];
        for (int i = 0; i <= N; i++) {
            map[0][i] = 1;
        }
        for (int i = 0; i < K; i++) {
            map[i][0] = 1;
        }
        for (int i = 1; i < K; i++) {
            int val = 1;
            for (int j = 1; j <= N; j++) {
                map[i][j] = val = (val + map[i - 1][j]) % div;
            }
        }
        System.out.println(map[K - 1][N]);
    }
}