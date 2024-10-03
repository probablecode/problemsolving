import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        for (String num : br.readLine().split(" "))
            set.add(Integer.parseInt(num));
        int M = Integer.parseInt(br.readLine());
        int[] ans = new int[M];
        int cnt = 0;
        for (String num : br.readLine().split(" "))
            ans[cnt++] = set.contains(Integer.parseInt(num)) ? 1 : 0;
        StringBuffer sb = new StringBuffer(M * 2 + 1);
        sb.append(String.valueOf(ans[0]));
        for (int i = 1; i < M; i++)
            sb.append(String.format(" %d", ans[i]));
        System.out.println(sb.toString());
        br.close();
    }
}