class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int i = 0; int j = 0;
        while (i < arr.length)
        {
            if (j == 0)
                stk[j++] = arr[i++];
            else
            {
                if (stk[j - 1] < arr[i])
                    stk[j++] = arr[i++];
                else
                    stk[j--] = 0;
            }
        }
        int[] ans = new int[j];
        System.arraycopy(stk, 0, ans, 0, j);
        return ans;
    }
}