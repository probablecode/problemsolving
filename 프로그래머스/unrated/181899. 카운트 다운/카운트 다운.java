class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        for (int i = 0; end_num <= start - i; i++)
            answer[i] = start - i;
        return answer;
    }
}