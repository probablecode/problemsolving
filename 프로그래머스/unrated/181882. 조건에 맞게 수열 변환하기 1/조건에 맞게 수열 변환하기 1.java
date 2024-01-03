class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++)
        {
            if (50 <= arr[i] && arr[i] % 2 == 0)
                ans[i] = arr[i] / 2;
            else if (arr[i] < 50 && arr[i] % 2 == 1)
                ans[i] = arr[i] * 2;
            else
                ans[i] = arr[i];
        }
        return ans;
    }
}