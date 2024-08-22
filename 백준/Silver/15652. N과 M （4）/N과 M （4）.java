import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;

    public static BufferedWriter bw;
    public static char[] charArray;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        charArray = ("  ".repeat(M - 1) + " \n").toCharArray();
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        go(0, 0);
        bw.close();
    }

    private static void go(int base, int len) throws IOException {
        if (len == M) {
            bw.write(new String(charArray));
            return;
        }
        for (int i = base; i < N; i++) {
            charArray[len * 2] = (char)('1' + i);
            go(i, len + 1);
        }
    }
}