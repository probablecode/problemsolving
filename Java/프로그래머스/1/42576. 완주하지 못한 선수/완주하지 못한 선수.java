import java.util.Map;
import java.util.HashMap;


class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> runner = new HashMap<>();
        
        for (String par : participant) {
            if (!runner.containsKey(par)) {
                runner.put(par, 1);
            }
            else {
                int num = runner.get(par);
                runner.replace(par, num + 1);
            }
        }
        for (String par : completion) {
            int num = runner.get(par);
            runner.replace(par, --num);
            runner.remove(par, 0);
        }
        String[] failed = runner.keySet().toArray(new String[0]);
        return failed[0];
    }
}