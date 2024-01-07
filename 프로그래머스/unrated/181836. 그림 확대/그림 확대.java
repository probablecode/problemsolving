class Solution {
    public String[] solution(String[] picture, int k) {
        int row = picture.length;
        int col = picture[0].length();
        
        char[][] exp = new char[row * k][col * k];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                char ch = picture[i].charAt(j);
                for (int i_ = 0; i_ < k; i_++)
                {
                    for (int j_ = 0; j_ < k; j_++)
                        exp[i * k + i_][j * k + j_] = ch;
                }
            }
        }
        String[] answer = new String[row * k];
        for (int i = 0; i < row * k; i++)
            answer[i] = new String(exp[i]);
        return answer;
    }
}