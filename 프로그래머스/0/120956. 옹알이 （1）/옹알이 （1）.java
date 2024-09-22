import java.util.*;
class Solution {
    public static String[] src = {"aya", "ye", "woo", "ma"};
    public static boolean[] checked = new boolean[4];
    public static Set<String> set = new HashSet<>();

    private static void go(int cnt, int num, String str) {
        if (cnt == num) {
            set.add(str);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (checked[i])
                continue;
            checked[i] = true;
            go(cnt + 1, num, str + src[i]);
            checked[i] = false;
        }
    }
    
    public int solution(String[] babbling) {
    
        for (int num = 1; num <= 4; num++)
            go(0, num, "");

        int answer = 0;

        for (String s : babbling)
            if (set.contains(s))
                answer++;
        return answer;
    }
}