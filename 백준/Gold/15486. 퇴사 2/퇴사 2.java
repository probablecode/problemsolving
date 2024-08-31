import java.io.*;

public class Main {
    public static int[] time;
    public static int[] pay;
    public static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        time = new int[N + 1];
        pay = new int[N + 1];
        memo = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            String[] split = br.readLine().split(" ");
            time[i] = Integer.parseInt(split[0]);
            pay[i] = Integer.parseInt(split[1]);
        }

        for (int i = 1; i <= N; i++) {
            memo[i] = Math.max(memo[i], memo[i - 1]);
            int after = time[i] + i;
            if (after <= N + 1) {
                int afterPay = memo[i] + pay[i];
                if (memo[after] < afterPay) {
                    memo[after] = afterPay;
                }
            }
        }
        System.out.println(Math.max(memo[N], memo[N +1]));
        br.close();
    }
}