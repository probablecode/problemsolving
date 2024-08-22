import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;
    public static int[] num;

    public static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        num = new int[M];
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        go(0);
        bw.close();
    }

    private static void go(int len) throws IOException {
        if (len == M) {
            print();
            return;
        }
        for (int i = 0; i < N; i++) {
            num[len] = i + 1;
            go(len + 1);
        }
    }

    private static void print() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(num[i]);
            if (i < M - 1) {
                sb.append(' ');
            }
        }
        sb.append('\n');
        bw.write(sb.toString());
    }
}