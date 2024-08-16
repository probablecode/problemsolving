import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int LEN;
    public static int[][] memo;
    public static int[] input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LEN = sc.nextInt();
        if (LEN == 0) {
            System.out.println(0);
            return;
        }
        input = new int[LEN];
        memo = new int[LEN][2];
        memo[0][0] = input[0] = sc.nextInt();
        if (LEN == 1) {
            System.out.println(input[0]);
            return;
        }
        memo[1][0] = input[1] = sc.nextInt();
        memo[1][1] = memo[0][0] + memo[1][0];

        for (int i = 2; i < LEN; i++) {
            input[i] = sc.nextInt();
            memo[i][0] = Math.max(memo[i - 2][1], memo[i - 2][0]) + input[i];
            memo[i][1] = memo[i - 1][0] + input[i];
        }
        System.out.println(Math.max(memo[LEN - 1][0], memo[LEN - 1][1]));
    }
}