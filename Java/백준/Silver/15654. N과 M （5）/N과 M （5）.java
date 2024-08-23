import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static int N;
    public static int M;

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] idx;
    public static boolean[] check;

    public static Integer[] num;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] N_M = sc.nextLine().split(" ");
        N = Integer.parseInt(N_M[0]);
        M = Integer.parseInt(N_M[1]);
        TreeSet<Integer> tSet = new TreeSet<>();
        String[] split = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++)
            tSet.add(Integer.parseInt(split[i]));
        num = tSet.toArray(new Integer[0]);
        check = new boolean[N];
        idx = new int[M];
        go(0);
        bw.close();
    }

    private static void go(int len) throws IOException {
        if (len == M) {
            print();
            return;
        }

        for (int i = 0; i < N; i++) {
//            if (N - i < M - len)
//                return;
            if (check[i]) continue;
            idx[len] = i;
            check[i] = true;
            go(len + 1);
            check[i] = false;
         }
    }
    private static void print() throws IOException {
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < M; i++)
            sb.append(String.format("%d ", num[idx[i]]));
        sb.setCharAt(sb.length() - 1, '\n');
        bw.write(sb.toString());
    }
}