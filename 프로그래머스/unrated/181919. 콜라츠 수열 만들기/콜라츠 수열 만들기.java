class Solution {
    public int[] solution(int n) {
        
        int len = 1;
        for (int m = n; m != 1; m = m % 2 == 0 ? m / 2 : 3 * m + 1)
            len++;
        int[] answer = new int[len];
        len = 0;
        for (int m = n; m != 1; m = m % 2 == 0 ? m / 2 : 3 * m + 1)
            answer[len++] = m;
        answer[len] = 1;
        return answer;
    }
}