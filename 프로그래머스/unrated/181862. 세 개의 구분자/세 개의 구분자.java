class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a", " ");
        myStr = myStr.replaceAll("b", " ");
        myStr = myStr.replaceAll("c", " ");
        String[] splits = myStr.split(" ");
        String[] src = new String[splits.length];
        int count = 0;
        for (String str : splits)
            if (!str.isEmpty())
                src[count++] = str;
        
        if (count == 0)
        {
            String[] answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }
        String[] answer = new String[count];
        System.arraycopy(src, 0, answer, 0, count);
        return answer;
    }
}