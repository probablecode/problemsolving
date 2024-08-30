import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        String[] split = br.readLine().split(" ");
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++)
            pq.offer(Integer.parseInt(split[i]));
        for (int i = 0; i < N; i++)
            num[i] = pq.poll();
        int max = 0;
        do {
            max = Math.max(max, diffSum(num));
        } while (nextPermute(num));
        System.out.println(max);
        br.close();
    }

    private static int diffSum(int [] num) {
        int sum = 0;
        for (int i = 1; i < N; i++)
            sum += Math.abs(num[i] - num[i - 1]);
        return sum;
    }
    private static boolean nextPermute(int[] num) {
        int max = 0;
        for (int i = 1; i < N; i++)
            if (num[i - 1] < num[i])
                max = i;
        if (max == 0) return false;
        int pre = max - 1;
        for (int i = max + 1; i < N; i++)
            if (num[pre] < num[i])
                max = i;
        swap(num, pre, max);
        int a = pre + 1;
        int b = N - 1;
        while (a < b) {
            swap(num, a, b);
            a++;
            b--;
        }
        return true;
    }

    private static void swap(int[] num, int a, int b) {
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
    }

}
