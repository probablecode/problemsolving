import java.util.*;

public class Main {
    public static int[][] m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            boolean undone = true;
            int j = x - 1;
            for (int k = 0; k < N; k++) {
                if (j % N == y - 1) {
                    System.out.println(j + 1);
                    undone = false;
                    break;
                }
                j += M;
            }
            if (undone)
                System.out.println(-1);
        }
    }
}