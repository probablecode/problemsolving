import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] inputs = new int[N];
        int[] masc = new int[N];
        int[] mdsc = new int[N];
        String[] splits = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            inputs[i] = Integer.parseInt(splits[i]);
            int len = 1;
            for (int j = 0; j < i; j++) {
                if (inputs[j] < inputs[i])
                    len = Math.max(masc[j] + 1, len);
            }
            masc[i] = len;
        }
        for (int i = N - 1; 0 <= i; i--) {
            int len = 1;
            for (int j = N - 1; i < j; j--) {
                if (inputs[j] < inputs[i])
                    len = Math.max(mdsc[j] + 1, len);
            }
            mdsc[i] = len;
        }
        int max = 0;
        for (int i = 0; i < N; i++)
            max = Math.max(masc[i] + mdsc[i], max);
        System.out.println(max - 1);
        br.close();
    }
}