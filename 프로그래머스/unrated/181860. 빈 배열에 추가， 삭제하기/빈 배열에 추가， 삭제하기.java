class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] src = new int[1800];
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            if (flag[i])
            {
                for (int j = 0; j < arr[i] * 2; j++)
                    src[count++] = arr[i];
            }
            else
                count -= arr[i];
        }
        int[] answer = new int[count];
        System.arraycopy(src, 0, answer, 0, count);
        return answer;
    }
}