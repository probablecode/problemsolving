import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] D = new int[N];
        D[0] = 1;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 1; i < N; i++) {
            int iMax = 0;
            for (int j = 0; j < i; j++)
            {
                if (A[j] < A[i]) {
                    iMax = Math.max(D[j], iMax);
                }
            }
            D[i] = iMax + 1;
            max = Math.max(D[i], max);
        }
        System.out.println(0 < max ? max : 1);
    }
}
