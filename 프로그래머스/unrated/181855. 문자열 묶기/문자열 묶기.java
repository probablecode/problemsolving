class Solution {
    public int solution(String[] strArr) {
        int [] cnt = new int[30];
        for (String str : strArr)
            cnt[(str.length() - 1)]++;
        int max = 0;
        for (int num : cnt)
            max = (max < num ? num : max);
        return max;
    }
}