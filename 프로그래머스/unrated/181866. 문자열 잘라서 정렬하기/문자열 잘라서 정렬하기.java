import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] strs = myString.split("x");
        Arrays.sort(strs);
        int empty = 0;
        for (String str : strs)
            empty += (str.isEmpty() ? 1 : 0);
        String[] answer = new String[strs.length - empty];
        System.arraycopy(strs, empty, answer, 0, strs.length - empty);
        return answer;
    }
}