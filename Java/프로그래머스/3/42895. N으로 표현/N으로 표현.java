import java.util.*;

class Solution {
    public static final int MAX = 32000;
    public static List<Set<Integer>> hSets = new ArrayList<>();
    public static Set<Integer> total = new HashSet<>();
    // public static int[] memo = new int[MAX + 1];
    
    private static void init(int N) {
        for (int i = 0; i < 9; i++) {
            hSets.add(new HashSet<>());        
        }
        int dup = N;
        for (int i = 1; i < 7; i++) {
            hSets.get(i).add(dup);
            total.add(dup);
            dup = dup * 10 + N;
        }
    }
    
    private void checkAdd(Set<Integer> hSet, int num) {
        if (num <= 0 || MAX < num)
            return;
        if (!total.contains(num)) {
            total.add(num);
            hSet.add(num);
        }
            
    }
    
    public int solution(int N, int number) {
        init(N);
        for (int i = 2; i < 9; i++) {
            Set<Integer> hSet = new HashSet<>();
            for (int j = 1; j <= (i / 2); j++) {
                for (int a : hSets.get(j)) {
                    for (int b : hSets.get(i - j)) {
                        checkAdd(hSet, a + b);
                        checkAdd(hSet, a - b);
                        checkAdd(hSet, b - a);
                        checkAdd(hSet, b / a);
                        checkAdd(hSet, a / b);
                        checkAdd(hSet, a * b);
                    }
                }
            }
            hSets.get(i).addAll(hSet);
        }
        
        for (int i = 1; i < 9; i++) {
            // System.out.println(hSets.get(i));
            if (hSets.get(i).contains(number))
                return i;
        } 
        return -1;
    }
    
} 