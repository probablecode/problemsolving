class Solution {
    public int solution(String myString, String pat) {
        int idx = 0, count = 0;
        while (true)
        {
            idx = myString.indexOf(pat, idx) + 1;
            if (idx <= 0)
                break;
            count++;
        }
        return count;
    }
}