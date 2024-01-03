class Solution {
    public String solution(String my_string, String alp) {
        StringBuffer sb = new StringBuffer(my_string);
        while (true)
        {
            int idx = sb.indexOf(alp);
            if (idx == -1)
                break;
            sb.replace(idx, idx + 1, alp.toUpperCase());
        }
        return sb.toString();
    }
}