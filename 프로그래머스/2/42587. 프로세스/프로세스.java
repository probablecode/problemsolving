import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int order = 1;
        Queue <Integer>q = new LinkedList();
        for (int i = 0; i < priorities.length; i++)
            q.add(i);
        while (0 < q.size()) {
            int pid = q.poll();
            boolean run = true;
            for (int idx : q) {
                if (priorities[pid] < priorities[idx]) {
                    q.offer(pid);
                    run = false;
                    break;
                }
            }
            if (run)
            {
                if (pid == location)
                    answer = order;
                order++;
            }
        }
        return answer;
    }
}