class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer sb = new StringBuffer(my_string);
        for (int i : indices)
            sb.setCharAt(i, '0');
        int i = 0;
        while (i < sb.length())
        {
            if (sb.charAt(i) == '0')
                sb.deleteCharAt(i);
            else
                i++;
        }
        return sb.toString();    
    }
}