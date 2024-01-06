class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] src = new int[len];
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (0 < count && src[count - 1] == arr[i])
                count--;
            else
                src[count++] = arr[i];    
        }
        if (count == 0)
            src[count++] = -1;
        int[] answer = new int[count];
        System.arraycopy(src, 0, answer, 0, count);
        return answer;
    }
}