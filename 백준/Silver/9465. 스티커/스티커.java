import java.util.*;
import java.io.*;
public class Main {
    public static int[][] memo;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            memo = new int[n][3];
            int[] high = new int[n];
            int[] low = new int[n];
            int z = 0;
            for (String s : br.readLine().split(" "))
                high[z++] = Integer.parseInt(s);
            z = 0;
            for (String s : br.readLine().split(" "))
                low[z++] = Integer.parseInt(s);       
            memo[0][1] = high[0];
            memo[0][2] = low[0];
            for (int i = 1; i < n; i++) {
                memo[i][0] = Math.max(Math.max(memo[i - 1][1], memo[i - 1][2]), memo[i - 1][0]);
                memo[i][1] = Math.max(memo[i - 1][0], memo[i - 1][2]) + high[i];
                memo[i][2] = Math.max(memo[i - 1][0], memo[i - 1][1]) + low[i];
            }
            System.out.println(Math.max(memo[n - 1][1], memo[n - 1][2]));
        }
    }
}