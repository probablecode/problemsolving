class Solution {
    public int[] solution(String myString) { 
        String[] str = myString.split("x");
        int len = str.length;
        int[] answer = new int[len + (myString.endsWith("x") ? 1 : 0)];
        for (int i = 0; i < len; i++)
            answer[i] = str[i].length();
        return answer;
    }
}