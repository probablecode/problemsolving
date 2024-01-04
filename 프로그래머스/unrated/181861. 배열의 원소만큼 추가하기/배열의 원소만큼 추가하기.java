class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for (int num : arr)
            len += num;
        int[] answer = new int[len];
        int count = 0;
        for (int num : arr)
        {
            for (int i = 0; i < num; i++)
                answer[count++] = num;
        }
        return answer;
    }
}