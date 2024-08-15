import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static boolean[][]map;
    public static int[][] cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" ");
        int M = Integer.parseInt(MN[0]);
        int N = Integer.parseInt(MN[1]);
        map = new boolean[M][N];
        cost = new int[M][N];

        for (int i = 0; i < M; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < N; j++)
                map[i][j] = row[j].equals("1");
        }
        br.close();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        map[0][0] = false;
        while (!q.isEmpty()) {
            int now = q.poll();
            int row = now / N;
            int col = now % N;
            int score = cost[row][col];
            if (row == M - 1 && col == N - 1) {
                System.out.println(score + 1);
                break;
            }
            int mov = row - 1;
            if (0 <= mov && map[mov][col]) {
                map[mov][col] = false;
                cost[mov][col] = score + 1;
                q.add(now - N);
            }
            mov = row + 1;
            if (mov < M && map[mov][col]) {
                map[mov][col] = false;
                cost[mov][col] = score + 1;
                q.add(now + N);
            }
            mov = col - 1;
            if (0 <= mov && map[row][mov]) {
                map[row][mov] = false;
                cost[row][mov] = score + 1;
                q.add(now - 1);
            }
            mov = col + 1;
            if (mov < N && map[row][mov]) {
                map[row][mov] = false;
                cost[row][mov] = score + 1;
                q.add(now + 1);
            }
        }
    }
}