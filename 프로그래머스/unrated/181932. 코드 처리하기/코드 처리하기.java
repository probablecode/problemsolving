class Solution {
    public String solution(String code) {
        char[] chArr = code.toCharArray();
        boolean mode = false;
        String ret = "";
//        StringBuffer ret = new StringBuffer("");

        for (int i = 0; i < chArr.length; i++) {
            if (mode)
            {
                if (chArr[i] != '1' && i % 2 == 1)
                    ret += chArr[i];// .append(chArr[i]);
                else if (chArr[i] == '1')
                    mode = false;
            }
            else
            {
                if (chArr[i] != '1' && i % 2 == 0)
                    ret += chArr[i];//.append(chArr[i]);
                else if (chArr[i] == '1')
                    mode = true;
            }
        }
        return ret.equals("") ? "EMPTY" : ret;//.toString();
    }
}