import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static int N;
    public static int M;

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] cnt;

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
//        check = new boolean[N];
        cnt = new int[N];
        go(0, 0);
        bw.close();
    }

    private static void go(int base, int len) throws IOException {
        if (len == M) {
            print();
            return;
        }

        for (int i = base; i < N; i++) {
            cnt[i]++;
            go(i, len + 1);
            cnt[i]--;
        }
    }
    private static void print() throws IOException {
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < cnt[i]; j++)
                sb.append(String.format("%d ", num[i]));
        sb.setCharAt(sb.length() - 1, '\n');
        bw.write(sb.toString());
    }
}