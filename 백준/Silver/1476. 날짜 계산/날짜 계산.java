import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        final int max = 15 * 28 * 19;

        int year = 0;
        while (year < max) {
            int divd = year++;
            if (divd % 15 + 1 != E)
                continue;
            if (divd % 28 + 1 != S)
                continue;
            if (divd % 19 + 1 != M)
                continue;
            break;
        }
        System.out.println(year);
    }
}
