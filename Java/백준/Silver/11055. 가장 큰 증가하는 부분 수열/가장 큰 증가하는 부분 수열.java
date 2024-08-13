import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static int[] inputs;
    public static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        inputs = new int[N];
        memo = new int[N];
        String[] strs = br.readLine().split(" ");
        int max = 0;
        for (int i = 0; i < N; i++) {
            int pre = 0;
            inputs[i] = Integer.parseInt(strs[i]);
            for (int j = 0; j < i; j++) {
                if (inputs[j] < inputs[i])
                    pre = Math.max(pre, memo[j]);
            }
            memo[i] = pre + inputs[i];
            max = Math.max(memo[i], max);
        }
        System.out.println(max);
        br.close();
    }
}
