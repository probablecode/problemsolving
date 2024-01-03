import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length - 5;
        int [] ans = new int[len];
        Arrays.sort(num_list);
        System.arraycopy(num_list, 5, ans, 0, len);
        return ans;
    }
}