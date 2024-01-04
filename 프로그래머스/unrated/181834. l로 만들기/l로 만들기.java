class Solution {
    public String solution(String myString) {
        char[] str = myString.toCharArray();
        for (int i = 0; i < str.length; i++)
            str[i] = str[i] < 'l' ? 'l' : str[i];
        return new String(str);
    }
}