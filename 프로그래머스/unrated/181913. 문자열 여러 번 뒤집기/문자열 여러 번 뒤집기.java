class Solution {
    public String solution (String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        for (int[] q : queries)
        {
            for (int i = 0; q[0] + i < q[1] - i; i++)
            {
                char ch = sb.charAt(q[0] + i);
                sb.setCharAt(q[0] + i, sb.charAt(q[1] - i));
                sb.setCharAt(q[1] - i, ch);                
            }
        }
        return sb.toString();
    }
}