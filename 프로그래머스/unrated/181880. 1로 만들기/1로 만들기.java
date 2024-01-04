class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for (int i = 0; i < num_list.length; i++)
            for (int num = num_list[i]; 1 != num; count++)
                num = (num % 2 == 0 ? num / 2 : (num - 1) / 2);
        return count;
                       
    }
}