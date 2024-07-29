import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] D = new int[N];
        int[] pre = new int[N];
        D[0] = 1;
        pre[0] = -1;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int max = 0;
        int end = 0;
        for (int i = 1; i < N; i++) {
            int iMax = 0;
            int iPre = -1;
            for (int j = 0; j < i; j++)
            {
                if (A[j] < A[i] && iMax < D[j]) {
                    iMax = D[j];
                    iPre = j;
                }
            }
            D[i] = iMax + 1;
            pre[i] = iPre;
            if (max < D[i]) {
                max = D[i];
                end = i;
            }
        }
        System.out.println(0 < max ? max : 1);
        Stack<Integer> stack = new Stack<>();
        while (pre[end] != -1) {
            stack.push(end);
            end = pre[end];
        }
        System.out.print(A[end]);
        while (!stack.isEmpty()) {
            System.out.printf(" %d", A[stack.pop()]);
        }
    }
}