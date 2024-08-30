import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(split[i]);

        int max = 0;
        for (int i = 1; i < N; i++)
            if (num[i - 1] > num[i])
                max = i;
        if (0 < max) {
            int pre = max - 1;
            for (int i = max + 1; i < N; i++)
                if (num[i] < num[pre])
                    max = i;
            swap(num, pre, max);
            int a = pre + 1;
            int b = N - 1;
            while (a < b) {
                swap(num, a, b);
                a++;
                b--;
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(String.valueOf(num[0]));
            for (int i = 1; i < N; i++)
                bw.write(String.format(" %d", num[i]));
            bw.newLine();
            bw.close();
        }
        else System.out.println(-1);
        br.close();
    }

    private static void swap(int[] num, int a, int b) {
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
    }
}