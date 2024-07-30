import java.util.Scanner;

public class Main {
    public static int count[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count = new int[n + 1];

        int num = 1;
        while (num * num <= n) {
            count[num * num] = 1;
            num++;
        }
        if (0 < count[n]) {
            System.out.println(count[n]);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (0 < count[i])
                continue;
            int min = i;
            int small = 1;
            int big = i - small;
            while (small <= big) {
                min = Math.min(count[big] + count[small], min);
                small++;
                big--;
            }
            count[i] = min;
        }
        System.out.println(count[n]);
    }
}