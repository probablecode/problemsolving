import java.io.*;

public class Main {
    public static boolean[][] map;
    public static int count;
    public static int w;
    public static int h;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] size = br.readLine().split(" ");
            w = Integer.parseInt(size[0]);
            h = Integer.parseInt(size[1]);
            if (w == 0 && h == 0)
                break;
            map = new boolean[h][w];
            count = 0;
            for (int i = 0; i < h; i++) {
                String[] numbers = br.readLine().split(" ");
                for (int j = 0; j < w; j++)
                    if (numbers[j].equals("1")) {
                        map[i][j] = true;
                        count++;
                    }
            }
            int num = 0;
            while (0 < count) {
                for (int i = 0; i < h; i++) {
                    for(int j = 0; j < w; j++) {
                        if (map[i][j]) {
                            dfs(i, j);
                            num++;
                        }
                    }
                }
            }
            System.out.println(num);
        }



        br.close();
    }

    private static void dfs(int i, int j) {
        if (!map[i][j])
            return;
        map[i][j] = false;
        count--;
        boolean up = 0 < i;
        boolean down = i + 1 < h;
        boolean left = 0 < j;
        boolean right = j + 1 < w;
        if (up) {
            if (map[i - 1][j])
                dfs(i - 1, j);
            if (left && map[i - 1][j - 1])
                dfs(i - 1, j - 1);
            if (right && map[i - 1][j + 1])
                dfs(i - 1, j + 1);
        }
        if (down) {
            if (map[i + 1][j])
                dfs(i + 1, j);
            if (left && map[i + 1][j - 1])
                dfs(i + 1, j - 1);
            if (right && map[i + 1][j + 1])
                dfs(i + 1, j + 1);
        }
        if (left && map[i][j - 1])
            dfs(i, j - 1);
        if (right && map[i][j + 1])
            dfs(i, j + 1);
    }

}