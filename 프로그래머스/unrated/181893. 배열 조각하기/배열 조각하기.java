class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0, end = arr.length;
        for (int i = 0; i < query.length; i++)
        {
            if (i % 2 == 0)
                end = start + query[i] + 1;
            else
                start += query[i];        
        }
        int[] answer = new int[end - start];
        System.arraycopy(arr, start, answer, 0, end - start);
        return answer;
    }
}