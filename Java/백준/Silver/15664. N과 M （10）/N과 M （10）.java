import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static int N;
    public static int M;

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] idx;
    public static String[] num;
    public static HashSet<String> unique = new HashSet<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] N_M = sc.nextLine().split(" ");
        N = Integer.parseInt(N_M[0]);
        M = Integer.parseInt(N_M[1]);
        Queue<Integer> queue = new PriorityQueue<>();
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++)
            queue.add(Integer.parseInt(split[i]));
        int k = 0;
        num = new String[N];
        while (!queue.isEmpty())
            num[k++] = String.valueOf(queue.poll()) + " ";
        idx = new int[M];
        go(0, 0);
        bw.close();
    }

    private static void go(int base, int len) throws IOException {
        if (len == M) {
            print();
            return;
        }

        for (int i = base; i < N; i++) {
            if (N - i < M - len)
                return;
            idx[len] = i;
            go(i + 1, len + 1);
        }
    }
    private static void print() throws IOException {
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < M; i++)
            sb.append(num[idx[i]]);
        sb.setCharAt(sb.length() - 1, '\n');
        String toPrint = sb.toString();
        if (!unique.contains(toPrint)) {
            unique.add(toPrint);
            bw.write(toPrint);
        }
    }
}