class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int len = intStrs.length;
        int[] tmp = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (k < num)
                tmp[count++] = num;
        }
        int[] answer = new int [count];
        System.arraycopy(tmp, 0, answer, 0, count);
        return answer;
    }
}