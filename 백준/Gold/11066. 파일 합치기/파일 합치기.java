import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(sc.nextLine());
            int[] input = new int[n];
            int[][] memo = new int[n][n];
            String[] split = sc.nextLine().split(" ");
            for (int k = 0; k < n; k++)
                input[k] = Integer.parseInt(split[k]);
            for (int k = 1; k < n; k++)
                memo[k - 1][k] = input[k - 1] + input[k];

            for (int k = 2; k < n; k++) {
                for (int i = 0; i + k < n; i++) {
                    int sum = 0;
                    for (int j = i; j <= i + k; j++)
                        sum += input[j];
                    int min = Math.min(memo[i + 1][i + k], memo[i][i + k - 1]);
                    for (int j = 1; j < k - 1; j++) {
                        min = Math.min(min, memo[i][i + j] + memo[i + j + 1][i + k]);
                    }
                    memo[i][i + k] = min + sum;
                }
            }
//            System.out.println("---------------------------");
//            for (int j = 0; j < n; j++) {
//                for (int l = 0; l < n; l++)
//                    System.out.printf("%d\t", memo[j][l]);
//                System.out.println();
//            }
//            System.out.println("---------------------------");

            System.out.println(memo[0][n - 1]);
        }
    }
}
