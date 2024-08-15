import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] inputs = new int[N];
        int[] memo = new int[N];
        String[] splits = br.readLine().split(" ");
        int max = 0;
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(splits[i]);
            int len = 1;
            for (int j = 0; j < i; j++) {
                if (inputs[j] > inputs[i])
                    len = Math.max(memo[j] + 1, len);
            }
            memo[i] = len;
            max = Math.max(max, len);
        }
        System.out.println(max);
        br.close();
    }
}