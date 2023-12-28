class Solution {
    public String solution(String my_string, int k) {
        StringBuffer sb = new StringBuffer(my_string.length() * k);
        for (int i = 0; i < k; i++)
            sb.append(my_string);
         return sb.toString();
    }
}