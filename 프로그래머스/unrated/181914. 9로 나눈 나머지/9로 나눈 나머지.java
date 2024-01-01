class Solution {
    public int solution(String number) {
        int num = 0;
        for (char ch : number.toCharArray())
            num += (ch - '0');
        return num % 9;
    }
}