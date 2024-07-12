class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean a = ineq.equals(">");
        boolean b = eq.equals("=");
        if (a && b)
            return n >= m ? 1 : 0;
        else if (a && !b)
            return n > m ? 1 : 0;
        else if (!a && b)
            return n <= m ? 1 : 0;
        else
            return n < m ? 1 : 0;
    }
}