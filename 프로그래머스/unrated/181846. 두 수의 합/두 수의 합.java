class Solution {
    public String solution(String a, String b) {
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        StringBuffer sb = new StringBuffer(100001);
        boolean carry = false;
        int i = aArr.length, j = bArr.length;
        while (!(i == 0 && j == 0 && !carry))
        {
            int num = 0;
            if (0 < i)
                num += (aArr[--i] - '0');
            if (0 < j)
                num += (bArr[--j] - '0');
        
//            num += (0 < i ? (aArr[--i] - '0') : 0);
//            num += (0 < j ? (bArr[--j] - '0') : 0);
            num += (carry ? 1 : 0);
            carry = 10 <= num;
            sb.append((char)('0' + (num % 10)));
        }
        return sb.reverse().toString();
    }
}