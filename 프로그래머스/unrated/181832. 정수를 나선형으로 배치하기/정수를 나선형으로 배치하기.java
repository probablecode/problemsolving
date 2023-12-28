class Solution {
    public int[][] solution(int n) {
        int[][] move = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] answer = new int[n][n];
        int x = 0, y = 0, phase = 0;
        for (int i = 1; i <= n * n; i++)
        {
            answer[x][y] = i;
            int[] tmp = {
                x + move[phase][0],
                y + move[phase][1]
            };

            boolean flag = 
                (0 <= tmp[0] && tmp[0] < n) &&
                (0 <= tmp[1] && tmp[1] < n) &&
                (answer[tmp[0]][tmp[1]] == 0);
            if (!flag)
                phase = (phase + 1) % 4;
            x += move[phase][0];
            y += move[phase][1];
        }
        return answer;
    }
}