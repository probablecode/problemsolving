import java.util.Scanner;

public class Main {
    public static int k;
    public static long max = Long.MIN_VALUE;
    public static long min = Long.MAX_VALUE;
    public static boolean check[] = new boolean[10];
    public static boolean isGT[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = Integer.parseInt(sc.nextLine());
        String[] splits = sc.nextLine().split(" ");
        isGT = new boolean[k];
        for (int i = 0; i < k; i++)
            isGT[i] = splits[i].equals(">");
        for (int i = 0; i < 10; i++) {
            check[i] = true;
            go(i, i, 0);
            check[i] = false;
        }
        String maxStr = String.valueOf(max);
        String minStr = String.valueOf(min);


        if (maxStr.length() < k + 1) maxStr = "0" + maxStr;
        if (minStr.length() < k + 1) minStr = "0" + minStr;
        System.out.println(maxStr);
        System.out.println(minStr);
    }

    private static void go(int pre, long num, int cnt) {
        if (cnt == k) {
            min = Math.min(num, min);
            max = Math.max(num, max);
            return;
        }

        if (isGT[cnt]) {
            for (int i = pre - 1; 0 <= i; i--) {
                if (check[i])
                    continue;
                check[i] = true;
                go(i, num * 10 + i, cnt + 1);
                check[i] = false;
            }
        }
        else {
            for (int i = pre + 1; i < 10; i++) {
                if (check[i])
                    continue;
                check[i] = true;
                go(i, num * 10 + i, cnt + 1);
                check[i] = false;
            }
        }
    }
}