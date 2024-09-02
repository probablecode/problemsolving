import java.io.*;

public class Main {
    public static int N;
    public static int[] pick = new int[6];

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] split = br.readLine().split(" ");
            N = Integer.parseInt(split[0]);
            if (N == 0) break;
            boolean[] checked = new boolean[N];
            int[] num = new int[N];
            for (int i = 0; i < N; i++)
                num[i] = Integer.parseInt(split[i + 1]);
            go(num, 0, 0);
            bw.newLine();
        }
        br.close();
        bw.close();
    }

    private static void go(int[] num, int base, int len) throws IOException {
        if (len == 6) {
            bw.write(String.format("%d %d %d %d %d %d\n", pick[0], pick[1], pick[2], pick[3], pick[4], pick[5]));
            return;
        }
        for (int i = base; i < N; i++) {
            if (N - i < 6 - len) return;
            pick[len] = num[i];
            go(num, i + 1, len + 1);
        }
    }
}