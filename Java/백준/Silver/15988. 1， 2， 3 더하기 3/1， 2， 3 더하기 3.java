import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static final int DIV = 1000000009;
    public static final int LEN = 1000000;
    
    public static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        memo = new int[LEN];
        memo[0] = 1;
        memo[1] = 2;
        memo[2] = 4;
        for (int i = 3; i < LEN; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % DIV;
            memo[i] = (memo[i] + memo[i - 3]) % DIV;
        }
        for (int i = 0; i < T; i++)
            System.out.println(memo[Integer.parseInt(br.readLine()) - 1]);
    }
}