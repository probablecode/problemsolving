import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] sum = new int[n];
        int max = sum[0] = num[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            num[i] = sc.nextInt();
            sum[i] = Math.max(sum[i - 1] + num[i], num[i]);
            max = Math.max(max, sum[i]);
        }
        System.out.println(max);
    }
}