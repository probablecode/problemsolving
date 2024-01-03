class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 1 < n ? slicer[0] : 0;
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int diff = n == 4 ? slicer[2] : 1;
        int len = (end - start) / diff + 1;
        int[] answer = new int[len];
        for (int idx = 0, i = start; i <= end; idx++, i += diff)
            answer[idx] = num_list[i];
        return answer;
    }
}