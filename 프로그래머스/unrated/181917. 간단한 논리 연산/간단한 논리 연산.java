class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 && x3) || (x2 && x3) || (x1 && x4) || (x2 && x4);
    }
}