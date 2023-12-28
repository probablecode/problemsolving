class Solution {
    public int solution(int a, int b) {
        int oplus = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int pro = a * b * 2;
        return (oplus < pro ? pro : oplus);
    }
}