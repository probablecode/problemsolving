class Solution {
    public int[] solution(int[] arr) {
        int pre = 0;
        while (pre < arr.length && arr[pre] != 2)
            pre++;
        if (pre == arr.length)
            return (new int[] {-1});
        int suf = arr.length - 1;
        while (0 <= suf && arr[suf] != 2)
            suf--;
        int[]ans = new int[suf - pre + 1];
        System.arraycopy(arr, pre, ans, 0, suf - pre + 1);
        return ans;
    }
}