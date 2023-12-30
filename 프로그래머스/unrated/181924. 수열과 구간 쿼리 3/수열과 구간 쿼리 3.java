class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[arr.length];
        System.arraycopy(arr, 0, ans, 0, arr.length);
        for (int []q : queries)
        {
            int tmp = ans[q[0]];
            ans[q[0]] = ans[q[1]];
            ans[q[1]] = tmp;
        }
        return ans;
    }
}