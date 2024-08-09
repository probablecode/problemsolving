import java.util.*;
import java.io.*;

public class Main {
    public static boolean[][] map;
    public static Queue<Integer> answerQueue = new PriorityQueue<>();
    public static int count = 0;
    public static int N = 0;
    public static int num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == '1') {
                    map[i][j] = true;
                    count++;
                }
            }
        }
        while (0 < count) {
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    if (map[i][j])
                    {
                        num = 0;
                        dfs(i, j);
                        answerQueue.add(num);
                        break;
                    }
        }
        System.out.println(answerQueue.size());
        while (!answerQueue.isEmpty())
            System.out.println(answerQueue.poll());
        br.close();
    }
    private static void dfs(int i, int j) {
        map[i][j] = false;
        count--;
        num++;
        if (i + 1 < N && map[i + 1][j])
            dfs(i + 1, j);
        if (j + 1 < N && map[i][j + 1])
            dfs(i, j + 1);
        if (0 < i && map[i - 1][j])
            dfs(i - 1, j);
        if (0 < j && map[i][j - 1])
            dfs(i, j - 1);
    }
}