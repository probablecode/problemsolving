import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] lostArr = new boolean[n + 1];
        boolean[] resvArr = new boolean[n + 1];
        int answer = n - lost.length;
        for (int l : lost)
            lostArr[l] = true;
        for (int r : reserve) {
            if (lostArr[r]) {
                lostArr[r] = false;
                answer++;
            }
            else
                resvArr[r] = true;
        }
        
        for (int i = 1; i < n; i++) {
            if (!lostArr[i])
                continue;
            for (int j = -1; j < 2; j++) {
                if (resvArr[i + j]) {
                    resvArr[i + j] = false;
                    answer++;
                    break;
                }
            }            
        }
        if (lostArr[n] && resvArr[n - 1])
            answer++;
        return answer;
    }
}