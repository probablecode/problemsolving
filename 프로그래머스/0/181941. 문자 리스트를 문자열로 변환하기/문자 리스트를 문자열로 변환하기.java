class Solution {
    public String solution(String[] arr) {
        
        int len = arr.length;
        StringBuilder sb = new StringBuilder(len);
        for (String str : arr)
            sb.append(str);
        return sb.toString();
    }
}