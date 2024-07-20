import java.util.Scanner;
public class Main {
    private static int memo[] = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cost[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            cost[i] = sc.nextInt();
            memo[i] = cost[i];
            for (int j = 1; j < i; j++) {
                int newMax = memo[j] + cost[i - j];
                if (memo[i] < newMax)
                    memo[i] = newMax;
            }
        }
        System.out.println(memo[N]);
    }
}