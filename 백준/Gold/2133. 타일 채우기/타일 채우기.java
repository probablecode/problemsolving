import java.util.Scanner;

public class Main {

    public static int[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo = new int[N + 1];
        memo[0] = 1;
        for (int i = 2; i <= N; i += 2) {
            int num = 0;
            num += memo[i - 2] * 3;
            for (int j = i - 4; 0 <= j; j -= 2)
                num += memo[j] * 2;
            memo[i] = num;
        }
        System.out.println(memo[N]);
    }
}