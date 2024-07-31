import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> cMap= new HashMap<>();
        for (String[] cloth : clothes) {
            if (!cMap.containsKey(cloth[1])) {
                cMap.put(cloth[1], 1);
            }
            else {
                int num = cMap.get(cloth[1]);
                cMap.replace(cloth[1], ++num);
            }
        }
        int answer = 1;
        for (String cloth : cMap.keySet()) {
            answer *= (cMap.get(cloth) + 1);
        }
        return answer - 1;
    }
}