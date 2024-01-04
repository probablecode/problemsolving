class Solution {
    public int solution(int a, int b) {
        switch (a % 2 + b % 2)
        {
            case 0 :
                return a < b ? b - a : a - b;
            case 1 :
                return 2 * (a + b);
            case 2 :
                return a * a + b * b;
            default :
                return 1;
        }
    }
}