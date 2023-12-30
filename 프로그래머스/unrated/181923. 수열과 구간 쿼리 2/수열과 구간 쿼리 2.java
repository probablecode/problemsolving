class Solution {
    public int[] solution(int[] arr, int[][] q) {
        int ans[] = new int[q.length];
        
        for (int i = 0; i < q.length; i++)
        {
            ans[i] = -1;
            for (int j = q[i][0]; j <= q[i][1]; j++)
            {
                if (q[i][2] < arr[j] && (arr[j] < ans[i] || ans[i] == -1))
                        ans[i] = arr[j];
            }
        }
        return ans;
    }
}