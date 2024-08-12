import java.util.Scanner;

public class Main {
    public static int[][] m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = new int[n][3];
        int v = sc.nextInt();
        m[0][1] = v;
        for (int i = 1; i < n; i++) {
            v = sc.nextInt();
            m[i][0] = Math.max(Math.max(m[i - 1][0], m[i - 1][1]), m[i - 1][2]);
            m[i][1] = m[i - 1][0] + v;
            m[i][2] = m[i - 1][1] + v;
        }
        System.out.println(Math.max(Math.max(m[n - 1][0], m[n - 1][1]), m[n - 1][2]));
    }
}