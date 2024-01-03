class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[(n / k)];
        for (int i = 0, j = k; j <= n; i++, j += k)
            answer[i] = j;
        return answer;
    }
}