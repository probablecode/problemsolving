class Solution {
    public String[] solution(String[] str_list) {
        int len = str_list.length;
        String[]ans = new String[0];
        for (int i = 0; i < len; i++)
        {
            if (str_list[i].equals("l"))
            {
                ans = new String[i];
                System.arraycopy(str_list, 0, ans, 0, i);
                break;
            }
            if (str_list[i].equals("r"))
            {
                ans = new String[len - i - 1];
                System.arraycopy(str_list, i + 1, ans, 0, len - i - 1);
                break;
            }
        }
        return ans;
    }
}