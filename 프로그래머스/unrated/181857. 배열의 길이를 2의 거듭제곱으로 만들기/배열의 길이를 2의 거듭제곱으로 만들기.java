class Solution {
    public int[] solution(int[] arr) {
        int size = 1, len = arr.length;
        while (size < len)
            size *= 2;
        int[] answer = new int[size];
        System.arraycopy(arr, 0, answer, 0, len);
        return answer;
    }
}