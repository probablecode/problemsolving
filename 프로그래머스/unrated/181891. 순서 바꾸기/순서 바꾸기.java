class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] ans = new int[len];
        for (int i = 0; n + i < len; i++)
            ans[i] = num_list[n + i];
        for (int i = len - n; i < len; i++)
            ans[i] = num_list[i + n - len];
        return ans;
    }
}