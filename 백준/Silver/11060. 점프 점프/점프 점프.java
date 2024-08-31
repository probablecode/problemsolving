import java.io.*;

public class Main {
    public static boolean[] possible;
    public static int[] memo;
    public static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int[N];
        possible = new boolean[N];
        memo = new int[N];

        String[] split = br.readLine().split(" ");
        for (int i = 0; i < N; i++)
            input[i] = Integer.parseInt(split[i]);
        possible[0] = true;
        for (int i = 0; i < N; i++) {
            if (!possible[i]) continue;
            int limit = input[i] + i;
            for (int j = i + 1; j <= limit; j++) {
                if (N <= j) break;
                if (possible[j]) {
                    memo[j] = Math.min(memo[i] + 1, memo[j]);
                }
                else {
                    memo[j] = memo[i] + 1;
                    possible[j] = true;
                }
            }
        }
        System.out.println(possible[N - 1] ? memo[N - 1] : -1);
        br.close();
    }
}