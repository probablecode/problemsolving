class Solution {
    public int solution(int n) {
        return n % 2 == 0 ? n * (n + 1) * (n + 2) / 6 : (n + 1) * (n + 1) / 4;
        
        
    }
}