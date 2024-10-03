import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int[] arr;
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(split[i]);
        Arrays.sort(arr);



        int M = Integer.parseInt(br.readLine());
        split = br.readLine().split(" ");
        System.out.print(isIn(Integer.parseInt(split[0])) ? "1" : "0");
        for (int i = 1; i < M; i++)
            System.out.print(isIn(Integer.parseInt(split[i])) ? " 1" : " 0");
        br.close();
    }

    private static boolean isIn(int x) {
        int l = 0;
        int r = N - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == x)
                return true;
            else if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }

}