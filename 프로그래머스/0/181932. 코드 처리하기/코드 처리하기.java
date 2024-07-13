class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        char[] cArr = code.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            char ch = cArr[i];
            if (ch == '1') {
                mode = -mode + 1;
            }
            else {
                if (i % 2 == mode)
                    sb.append(ch);
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}