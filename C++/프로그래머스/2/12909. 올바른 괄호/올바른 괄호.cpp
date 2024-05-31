#include<string>
#include <iostream>
#include <stack>

using namespace std;

bool solution(string s)
{   
    // Stack<Integer> st = new Stack<>();
    stack<int> st;
    for (auto it = s.begin(); it != s.end(); it++) {
        if (*it == '(')
            st.push(*it);
        else
        {
            if (st.empty() || st.top() != '(')
                return false;
            else
                st.pop();
        }
    }
    return st.empty();    
}