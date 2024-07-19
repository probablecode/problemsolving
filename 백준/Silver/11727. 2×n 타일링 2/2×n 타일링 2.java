import java.util.Scanner;
public class Main {
    private static int[] memo = new int[1001];
    public static int tileing(int n) {
        if (n < 2)
            return 1;
        if (0 < memo[n])
            return memo[n];
        memo[n] = (tileing(n - 2) * 2 + tileing(n - 1)) % 10007 ;
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tileing(n));
    }
}