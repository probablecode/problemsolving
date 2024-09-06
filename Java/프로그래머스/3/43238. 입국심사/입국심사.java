class Solution {
    public long solution(int n, int[] times) {
        
        int max = 0;
        for (int time : times)
            max = Math.max(time, max);
        
        long right = (long)n * (long)max;
        long left = 1L;
        long val = 0L;
        while (left <= right) {
            long mid = (left + right) / 2;
            long cal = maxProcess(mid, times);
            
            if (cal < n) {
                left = mid + 1;
            } else {
                val = mid;
                right = mid - 1;
            }
        }
        return val;
    }
    
    
    public static long maxProcess(long minute, int[] times) {
        long ret = 0;
        for (int time : times) {
            ret += (minute / (long)time);
        }
        return ret;
    }
}