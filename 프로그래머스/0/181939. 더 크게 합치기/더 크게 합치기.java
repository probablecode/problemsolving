class Solution {
    public int solution(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        String ab = aStr + bStr;
        String ba = bStr + aStr;
        
        int abInt = Integer.parseInt(ab);
        int baInt = Integer.parseInt(ba);
        return abInt < baInt ? baInt : abInt;
    }
}