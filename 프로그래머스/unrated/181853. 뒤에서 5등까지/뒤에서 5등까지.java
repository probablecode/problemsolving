import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length; // 부수 효과를 없애기 위한 copy 처리
        int[] copy = new int[len];
        System.arraycopy(num_list, 0, copy, 0, len);
        Arrays.sort(copy);
        int[] answer = new int[5];
        System.arraycopy(copy, 0, answer, 0, 5);
        return answer;
    }
}