import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray())
        {
            if (c == '(')
                st.push(c);
            else if (c == ')') {
                if (st.empty() || '(' != st.peek())
                    return false;
                st.pop();
            }
        }        
        return st.empty();
    }
}