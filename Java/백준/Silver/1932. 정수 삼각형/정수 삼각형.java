import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] inputs;
    public static int[] m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = n * (n + 1) / 2;

        inputs = new int[len];
        m = new int[len];
        for (int i = 0; i < n; i++) {
            int now = i * (i + 1) / 2;
            String[] nums = br.readLine().split(" ");
            for (int k = 0; k <= i; k++) {
                inputs[now++] = Integer.parseInt(nums[k]);
            }
        }
        m[0] = inputs[0];
        for (int i = 1; i < n; i++) {
            int pre = i * (i - 1) / 2;
            int now = i * (i + 1) / 2;
            m[now] = m[pre] + inputs[now];
            int k = 1;
            while (k < i) {
                m[now + k] = Math.max(m[pre + k - 1], m[pre + k]) + inputs[now + k];
                k++;
            }
            m[now + i] = m[pre + i - 1] + inputs[now + i];
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int now = n * (n - 1) / 2;
            max = Math.max(max, m[now + i]);
        }
        System.out.println(max);
        br.close();
    }
}