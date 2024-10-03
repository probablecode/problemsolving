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
            long[] m = new long[L + 1];
            m[0] = 1;

            for (int i = 2; i <= L; i += 2) {
                long put = 0;
                for (int j = 0; j <= i - 2; j += 2)
                    put = (put + ((m[j] % mod) * (m[i - 2 -j] % mod) % mod)) % mod;
                m[i] = put;
            }
            System.out.println(m[L]);
        }
        br.close();
    }
}