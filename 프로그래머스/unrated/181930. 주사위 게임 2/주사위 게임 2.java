class Solution {
    public int solution(int a, int b, int c) {
        int ans = a + b + c;
        if (a != b && b != c && c != a)
            return ans;
        ans *= (a * a + b * b + c * c);
        if (a != b || b != c)
            return ans;
        else
            return ans * (a * a * a + b * b * b + c * c * c);
    }
}