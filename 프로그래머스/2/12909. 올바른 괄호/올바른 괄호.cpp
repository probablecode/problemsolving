#include <string>
#include <iostream>
#include <stack>
using namespace std;

bool solution(string s)
{
    int i = 0;
    stack<char> st;
    while (s[i]) {
        if (s[i] == '(')
            st.push(s[i]);
        else if (s[i] == ')') {
            if (st.empty() || st.top() != '(')
                return false;
            else
                st.pop();
        }
        else
            throw new exception;
        i++;
    }
    return st.empty();
}