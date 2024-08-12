import java.util.Scanner;

public class Main {
    public static int[] inputs;
    public static int[] m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = n * (n + 1) / 2;
        inputs = new int[len];
        m = new int[len];
        for (int i = 0; i < len; i++)
            inputs[i] = sc.nextInt();
        m[0] = inputs[0];
        for (int i = 1; i < n; i++) {
            int pre = i * (i - 1) / 2;
            int now = i * (i + 1) / 2;
            m[now] = m[pre] + inputs[now];
            int k = 1;
            while (k < i) {
                m[now + k] = Math.max(m[pre + k - 1], m[pre + k]) + inputs[now + k];
                k++;
            }
            m[now + i] = m[pre + i - 1] + inputs[now + i];
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int now = n * (n - 1) / 2;
            max = Math.max(max, m[now + i]);
        }
        System.out.println(max);
    }
}