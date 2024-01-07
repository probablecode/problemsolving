class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        int n = row > col ? row : col;
        int [][] answer = new int[n][n];
        for (int i = 0; i < row; i++)
            System.arraycopy(arr[i], 0, answer[i], 0, col);
        return answer;
    }
}