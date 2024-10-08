class Solution {
    public long solution(int n, int[] times) {
        
        long r = 1;
        while (true) {
            if (n <= check(r, times))
                break;
            r *= 2;
        }
        long l = r / 10;
        long answer = 0;
        while (l <= r) {
            long mid = (l + r) / 2;
            
            if (check(mid, times) < n)
                l = mid + 1;
            else {
                answer = mid;
                r = mid - 1;
            }
        }
        if (n <= check(answer - 1, times))
            answer--;

        return answer;
    }
    
    public int check(long time, int[] times) {
        int answer = 0;
        for (int t : times) {
            answer += (time / t);
        }
        return answer;
    }
}