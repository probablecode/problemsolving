import java.util.Set;
import java.util.HashSet;


class Solution {
    public int solution(int[] nums) {
        Set<Integer> option = new HashSet<>();    
        for (int n : nums)
            option.add(n);
        int unique = option.size();
        int choice = nums.length / 2;
        return Math.min(unique, choice);
    }
}