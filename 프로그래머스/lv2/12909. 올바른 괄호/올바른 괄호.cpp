#include<string>
#include <iostream>
#include <stack>

using namespace std;

bool solution(string s)
{
    stack<int> tmp;
    const char *p = s.c_str();
    while (*p)
    {
        if (*p == '(')
            tmp.push('(');
        else if (!tmp.empty() && *p == ')')
            tmp.pop();
        else
            return (false);
        p++;
    }
    return (tmp.empty());
}