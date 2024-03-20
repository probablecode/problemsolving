#include <iostream>
#include <string>
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
        i++;
    }
    return st.empty();
}
int    main(void) {
    int n;
    string s;

    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> s;
        if (solution(s))
			cout << "YES\n";
        else
            cout << "NO\n";
    }
    return 0;
}