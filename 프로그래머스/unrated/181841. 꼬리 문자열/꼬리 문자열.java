class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuffer sb = new StringBuffer(100);
        for (String str : str_list)
        {
            if (!str.contains(ex))
                sb.append(str);
        }
        return sb.toString();
    }
}