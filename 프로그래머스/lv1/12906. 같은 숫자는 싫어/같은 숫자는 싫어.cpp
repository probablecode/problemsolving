#include <vector>
#include <stack>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    stack<int> tmp;
    
    if (!arr.empty())
        tmp.push(arr.back());
    for (vector<int>::reverse_iterator it = arr.rbegin(); it != arr.rend(); it++)
    {
        if (tmp.top() != *it)
            tmp.push(*it);
    }
    while (!tmp.empty())
    {
        answer.push_back(tmp.top());
        tmp.pop();
    }
    return answer;
}