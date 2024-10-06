import java.util.*;

class Solution {
    public static List<LinkedList<Integer>> adjList;
    public static int[] dst;
    
    public int solution(int n, int[][] edge) {
        
        adjList = new ArrayList<>(n + 1);
        dst = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            adjList.add(new LinkedList<>());
            dst[i] = Integer.MAX_VALUE;
        }   
        
        for (int[] e : edge) {
            adjList.get(e[0]).add(e[1]);
            adjList.get(e[1]).add(e[0]);
        }
        
        dst[1] = 0;
        Queue<Dist> pq = new PriorityQueue<>();
        pq.add(new Dist(1, 0));
        
        while (!pq.isEmpty()) {
            Dist poll = pq.poll();
            for (int e : adjList.get(poll.d)) {
                if (poll.c + 1 < dst[e]) {
                    dst[e] = poll.c + 1;
                    pq.add(new Dist(e, dst[e]));
                }
            }
        }
        
        dst[0] = 0;
        int max = 0;
        for (int d : dst)
            max = Math.max(d, max);
        int answer = 0;
        for (int d : dst)
            answer += ((max == d) ? 1 : 0);
            
        return answer;
    }
    
    static class Dist implements Comparable {
        int d; int c;
        public Dist(int d_, int c_) { d = d_; c = c_;}
        
        @Override
        public int compareTo(Object o) {
            if (this.d > ((Dist)o).d)
                return 1;
            return -1;
        }
    }
}