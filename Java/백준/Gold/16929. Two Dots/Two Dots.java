import java.util.Scanner;

public class Main {
    public static int N;
    public static int M;
    public static char[][] map;
    public static boolean[][] check;
    public static int[][] dist;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] N_M = sc.nextLine().split(" ");
        N = Integer.parseInt(N_M[0]);
        M = Integer.parseInt(N_M[1]);
        map = new char[N][M];
        dist = new int[N][M];
        check = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            char[] cArr = sc.nextLine().toCharArray();
            for (int j = 0; j < M; j++)
                map[i][j] = cArr[j];
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (check[i][j])
                    continue;
                if (go(i, j, 0, map[i][j])) {
                    System.out.println("Yes");
                    return ;
                }
            }
        }
        System.out.println("No");
    }

    private static boolean go(int x, int y, int cnt, char color) {
        if (check[x][y]) {
            return 4 <= cnt - dist[x][y];
        }
        dist[x][y] = cnt;
        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0 <= nx && nx < N && 0 <= ny && ny < M && map[nx][ny] == color) {
                if (go(nx, ny, cnt + 1, color))
                    return true;
            }
        }
        return false;
    }
}