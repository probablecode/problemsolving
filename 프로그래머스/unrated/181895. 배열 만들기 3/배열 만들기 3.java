class Solution {
    public int[] solution(int[] arr, int[][] itv) {
        int len1 = itv[0][1] - itv[0][0] + 1; 
        int len2 = itv[1][1] - itv[1][0] + 1;
        int[]ans = new int[len1 + len2];
        System.arraycopy(arr, itv[0][0], ans, 0, len1);
        System.arraycopy(arr, itv[1][0], ans, len1, len2);        
        return ans;
    }
}