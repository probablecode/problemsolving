class Solution {
    public String[] solution(String[] strArr) {
        String[] src = new String[strArr.length];
        int len = 0;
        for (String str : strArr)
        {
            if (!str.contains("ad"))
                src[len++] = str;
        }
        String[] answer = new String[len];
        System.arraycopy(src, 0, answer, 0, len);
        return answer;
    }
}