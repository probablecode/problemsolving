class Solution {
    public int solution(int n) {
        
        if (n % 2 == 1)
            return (int)Math.pow((n + 1) / 2, 2);
        else
            return (n * (n + 1) * (n + 2) / 6);
        
    }
}