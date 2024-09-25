import java.util.Scanner;

public class Main {
    public static int[] m = new int[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m[0] = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10000; j++) {
                if (0 <= j - i)
                    m[j] += m[j - i];
            }
        }

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(m[sc.nextInt()]);
        }
    }
}