import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long mod = 1_000_000_007L;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int L = Integer.parseInt(br.readLine());
            if (L % 2 != 0) {
                System.out.println(0);
                continue;
            }
            L /= 2;
            long[] m = new long[L + 1];
            m[0] = 1;

            for (int i = 1; i <= L; i ++) {
                long put = 0;
                for (int j = 0; j <= i - 1; j++)
                    put = (put + (m[j] * m[i - 1 -j])) % mod;
                m[i] = put;
            }
            System.out.println(m[L]);
        }
        br.close();
    }
}