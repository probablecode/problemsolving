class Solution {
    public String solution(String n_str) {
        int idx = 0;

        for (char[] str = n_str.toCharArray(); idx < n_str.length() && str[idx] == '0';)
            idx++;
        return n_str.substring(idx);
    }
}