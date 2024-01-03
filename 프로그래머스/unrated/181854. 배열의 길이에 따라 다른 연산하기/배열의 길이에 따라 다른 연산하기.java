class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[]ans = new int[len];
        System.arraycopy(arr, 0, ans, 0, len);
        int start = len % 2 == 0 ? 1 : 0;
        for (int i = start; i < len; i += 2)
            ans[i] = arr[i] + n;
        return ans;
    }
}