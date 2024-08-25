import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static int N;
    public static int M;

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] idx;
    public static boolean[] check;
    public static String[] num;
    public static HashSet<String> unique;
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
        check = new boolean[N];
        idx = new int[M];
        unique = new HashSet<>();
        go(0);
        bw.close();
    }

    private static void go(int len) throws IOException {
        if (len == M) {
            print();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (check[i])
                continue;
            idx[len] = i;
            check[i] = true;
            go(len + 1);
            check[i] = false;
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
            bw.write(sb.toString());
        }
    }
}