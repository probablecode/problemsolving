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
        go(0);
        bw.close();
    }

    private static void go(int len) throws IOException {
        if (len == M) {
            bw.write(new String(charArray));
            return;
        }
        for (int i = 0; i < N; i++) {
            charArray[len * 2] = (char)('1' + i);
            go(len + 1);
        }
    }

}