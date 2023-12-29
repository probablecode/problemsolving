class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean bool;
        if (ineq.equals(">"))
        {
            if (eq.equals("="))
                bool = n >= m;
            else
                bool = n > m;            
        }
        else if (eq.equals("="))
            bool = n <= m;
        else
            bool = n < m;
        return bool ? 1 : 0;
    }
}