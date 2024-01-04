class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        String[] answer = new String[(len + 4) / 5];
        for (int i = 0, j = 0; i < len; i += 5, j++)
            answer[j] = names[i];
        return answer;
    }
}