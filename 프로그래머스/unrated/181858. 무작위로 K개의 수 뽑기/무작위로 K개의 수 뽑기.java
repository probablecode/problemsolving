import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        int count = 0;
        int[]src = new int[k];
        Arrays.fill(src, -1);
        for (int i = 0; i < arr.length && count < k; i++)
        {
            boolean dup = false;
            for (int j = 0; j < count && dup == false; j++)
                dup = (arr[i] == src[j]);
            if (!dup)
                src[count++] = arr[i];
        }
        return src;
    }
}