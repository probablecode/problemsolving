import java.util.Scanner;
public class Main {

    private static int[] memo = new int[11];

    public static void init() {
        memo[0] = 1;
        memo[1] = 1;
        memo[2] = 2;
    }

    public static int sum123(int n) {
        if (0 < memo[n])
            return memo[n];
        memo[n] = sum123(n - 1) + sum123(n - 2) + sum123(n - 3);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        init();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(sum123(n));
        }
    }
}
