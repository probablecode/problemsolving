import java.util.Set;
import java.util.HashSet;


class Solution {
    public int solution(int[] nums) {
        Set<Integer> hSet = new HashSet<>();
        for (int i : nums)
            hSet.add(i);
        int cnt = nums.length / 2;
        return hSet.size() < cnt ? hSet.size() : cnt;
    }
}