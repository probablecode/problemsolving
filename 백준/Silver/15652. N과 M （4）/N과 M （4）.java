import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static char[] charArray;
    public static int[] cnt;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        charArray = ("  ".repeat(M - 1) + " \n").toCharArray();
        cnt = new int[N];
        go(0, 0);
        bw.close();
    }

    private static void go(int base, int len) throws IOException {
        if (len == M) {
//            bw.write(new String(charArray));
            print();
            return;
        }
        for (int i = base; i < N; i++) {
            cnt[i]++;
            charArray[len * 2] = (char)('1' + i);
            go(i, len + 1);
            cnt[i]--;
        }
    }
    private static void print() throws IOException {
//        StringBuilder sb = new StringBuilder(M * 2);
//        for (int i = 0; i < N; i++) {
//            if (0 < cnt[i])
//                sb.append(String.format("%d ", i + 1).repeat(cnt[i]));
//        }
//        sb.setCharAt(M * 2 - 1, '\n');
//        bw.write(sb.toString());
        bw.write(new String(charArray));
    }
}