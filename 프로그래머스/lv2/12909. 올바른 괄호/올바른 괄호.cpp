#include<string>
#include <iostream>
#include <stack>

using namespace std;

bool solution(string s)
{
    stack<int> tmp;
    const char *p = s.c_str();
    int idx = 0, det = 0;
    
    while (p[idx])
    {
        if (p[idx] == '(')
            det++;
        else
            det--;
        if (det < 0)
            break;
        idx++;
    }
    return (det == 0);
}