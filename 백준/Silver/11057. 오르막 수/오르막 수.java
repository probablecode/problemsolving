import java.util.Scanner;
public class Main {
    public static int[][] memo;
    public static final int div = 10007;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        memo = new int[N][10];
        for (int i = 0; i < 10; i++)
            memo[0][i] = 1;
        for (int i = 1; i < N; i++) {
            int increment = 0;
            for (int j = 0; j < 10; j++) {
                increment += memo[i - 1][j];
                memo[i][j] = increment % div;
            }
        }
        int answer = 0;
        for (int i = 0; i < 10; i++)
            answer += memo[N - 1][i];
        System.out.println(answer % div);
    }
}