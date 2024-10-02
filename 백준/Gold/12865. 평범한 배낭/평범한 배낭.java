import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N_K = br.readLine().split(" ");
        int N = Integer.parseInt(N_K[0]);
        int K = Integer.parseInt(N_K[1]);
        int[] W = new int[N + 1];
        int[] V = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            String[] W_V = br.readLine().split(" ");
            W[i] = Integer.parseInt(W_V[0]);
            V[i] = Integer.parseInt(W_V[1]);
        }
        
        int[][] m = new int[N + 1][K + 1];
        
        
        for (int j = 1; j <= K; j++) {
            for (int i = 1; i <= N; i++) {
                int sum = m[i - 1][j];
                if (W[i] <= j)
                    sum = Math.max(sum, m[i - 1][j - W[i]] + V[i]);
                m[i][j] = sum;
            }
        }
        System.out.println(m[N][K]);
        
     
  
        br.close();
    }
}