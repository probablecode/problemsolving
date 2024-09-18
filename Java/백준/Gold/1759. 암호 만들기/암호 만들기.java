import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int L;
    public static int C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        sc.nextLine();
        String[] split = sc.nextLine().split(" ");

        Arrays.sort(split);
        go(split, 0, 0, 0, "");
    }

    private static void go(String[] split, int idx, int v, int c, String str) {
        int rest = L - (v + c);
        if (rest == 0) {
            if (0 < v && 1 < c)
                System.out.println(str);
            return;
        }
        else if (C - idx < rest) return;

        for (int i = idx; i < C; i++) {
            String s = split[i];
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"))
                go(split, i + 1, v + 1, c, str + s);
            else
                go(split, i + 1, v, c + 1, str + s);
        }
    }
}