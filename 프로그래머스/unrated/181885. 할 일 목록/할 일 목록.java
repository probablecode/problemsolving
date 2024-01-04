class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = finished.length;
        String[]strArr = new String[len];
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            if (!finished[i])
                strArr[count++] = new String(todo_list[i]);
        }
        String[] answer = new String[count];
        System.arraycopy(strArr, 0, answer, 0, count);
        return answer;
    }
}