class Solution {
    public static int[] head;
    public static int[] tail;
    public static int N;
    
    public int solution(int[] money) {
        N = money.length;
        head = new int[N - 1];
        tail = new int[N - 1];
        head[0] = money[0];
        head[1] = Math.max(money[0], money[1]);
        
        tail[0] = money[1];
        tail[1] = Math.max(money[1], money[2]);
        
        for (int i = 2; i < N - 1; i++) {            
            head[i] = Math.max(head[i - 1], head[i - 2] + money[i]);
            tail[i] = Math.max(tail[i - 1], tail[i - 2] + money[i + 1]);
        }
     
        return Math.max(head[N - 2], tail[N - 2]);
    }
}