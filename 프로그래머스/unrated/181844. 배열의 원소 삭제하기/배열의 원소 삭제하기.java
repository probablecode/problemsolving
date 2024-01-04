class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len = arr.length;
        int[] remain = new int[len];
        int count = 0;
        
        for (int i = 0; i < len; i++)
        {
            boolean to_delete = false;
            for (int j = 0; j < delete_list.length && to_delete == false; j++)
                to_delete = (delete_list[j] == arr[i]);
            if (!to_delete)
                remain[count++] = arr[i];
        }
        int[]answer = new int[count];
        System.arraycopy(remain, 0, answer, 0, count);
        return answer;
    }
}