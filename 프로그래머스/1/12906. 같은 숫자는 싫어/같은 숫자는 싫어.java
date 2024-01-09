import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int len = arr.length;
        int[] src = new int[len];
        src[0] = arr[0];
        int count = 1;
        for (int i = 1; i < len; i++)
            if (src[count - 1] != arr[i])
                src[count++] = arr[i];        
        int[] answer = new int [count];
        System.arraycopy(src, 0, answer, 0, count);
        return answer;
    }
}