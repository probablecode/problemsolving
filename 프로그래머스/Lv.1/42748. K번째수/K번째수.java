import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            int sublen = commands[i][1] - commands[i][0] + 1;
            int[] tmp = new int[sublen];
            System.arraycopy(array, commands[i][0] - 1, tmp, 0, sublen);
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2] - 1];      
        }
        return answer;
    }
}