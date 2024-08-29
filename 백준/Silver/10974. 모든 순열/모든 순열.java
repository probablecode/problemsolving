import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        for (int i = 0; i < N; i++)
            num[i] = i + 1;

        do {
            StringBuilder sb = new StringBuilder();
            for (int n : num)
                sb.append(String.format("%d ", n));
            System.out.println(sb.toString());
        } while (nextPermute(num));
        br.close();
    }

    private static boolean nextPermute(int[] num) {
        int max = 0;
        for (int i = 1; i < N; i++)
            if (num[i - 1] < num[i])
                max = i;
        if (max == 0) return false;
        int pre = max - 1;
        for (int i = max + 1; i < N; i++)
            if (num[pre] < num[i])
                max = i;
        swap(num, pre, max);
        int a = pre + 1;
        int b = N - 1;
        while (a < b) {
            swap(num, a, b);
            a++;
            b--;
        }
        return true;
    }

    private static void swap(int[] num, int a, int b) {
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
    }

}
