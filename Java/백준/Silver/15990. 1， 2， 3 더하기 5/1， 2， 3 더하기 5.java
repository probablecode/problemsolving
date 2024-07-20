    import java.util.Scanner;
    public class Main {
        private static long memo[][] = new long[100001][4];
        private static final long mod = 1000000009;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            init();
            for (int i = 4; i < 100001; i++) {
            memo[i][1] = (memo[i - 1][0] - memo[i - 1][1] + mod) % mod;
            memo[i][2] = (memo[i - 2][0] - memo[i - 2][2] + mod) % mod;
            memo[i][3] = (memo[i - 3][0] - memo[i - 3][3] + mod) % mod;
            memo[i][0] = (memo[i][1] + memo[i][2] + memo[i][3]) % mod;
            }

            for (int i = 0; i < T; i++) {
                int n = sc.nextInt();
                System.out.println(memo[n][0]);
            }
        }

        private static void init() {
            memo[1][0] = 1L;
            memo[1][1] = 1L;
            memo[2][0] = 1L;
            memo[2][2] = 1L;
            memo[3][0] = 3L;
            memo[3][1] = 1L;
            memo[3][2] = 1L;
            memo[3][3] = 1L;
        }
    }