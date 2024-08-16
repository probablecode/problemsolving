class Solution {
    public static final int MAX = 10000000;
    public static boolean[] nonPrime = new boolean[MAX];
    public static boolean[] check = new boolean[MAX];
    public static int maxLen;
    public static int count = 0;
    public static char[] cArr;
    
    public void recur(int idx, int num) {
        if (idx == maxLen) return;
        for (int i = 0; i < maxLen; i++) {
            if (cArr[i] == '-') continue;
            
            char tmp = cArr[i];
            cArr[i] = '-';
            num = num * 10 + ((int)tmp - '0');
            if (!nonPrime[num] && !check[num]) {
                count++;
                check[num] = true;
            }
            recur(idx + 1, num);
            cArr[i] = tmp;
            num /= 10;
        }
    }
    
    
    
    public int solution(String numbers) {
        cArr = numbers.toCharArray();
        maxLen = numbers.length();
        
        nonPrime[0] = true;
        nonPrime[1] = true;
        for (int i = 2; i * i < MAX;) {
            for (int n = i * i; n < MAX; n += i)
                nonPrime[n] = true;
            int next = i + 1;
            while (nonPrime[next])
                next++;
            i = next;
        }
        recur(0, 0);
        return count;
    }
    
}