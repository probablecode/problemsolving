import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int val = 1;
        int factor_2 = 0;
        int factor_5 = 0;
        for (int f = 2; f <= N; f++) {
            int factor = f;
            while (factor % 2 == 0) {
                factor_2++;
                factor /= 2;
            }
            while (factor % 5 == 0) {
                factor_5++;
                factor /= 5;
            }
        }
        System.out.println(Math.min(factor_2, factor_5));
    }
}