class Solution {
    public int solution(int a, int d, boolean[] inc) {
        int answer = 0;
        for (int i = 0; i < inc.length; i++)
            answer += inc[i] ? a + d * i : 0;
        return answer;
    }
}