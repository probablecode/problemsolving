import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int[] times;
    public static int[] pays;

    public static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        times = new int[N];
        pays = new int[N];

        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();
            pays[i] = sc.nextInt();
        }
        go(0, 0);
        System.out.println(max);
    }

    private static void go(int day, int sum) {
        if (N < day)
            return;
        if (N == day) {
            max = Math.max(max, sum);
            return;
        }

        // 그날 일을 했을 때
        go(day + times[day], sum + pays[day]);
        // 그날 일을 안했을 때
        go(day + 1, sum);
    }
}