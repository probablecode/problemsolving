import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(go(0, n));
        }
    }
    private static int go(int sum, int goal) {
        if (goal < sum) return 0;
        if (goal == sum) return 1;
        int now = 0;
        for (int i = 1; i < 4; i++) {
            now += go(sum + i, goal);
        }
        return now;
    }
}
