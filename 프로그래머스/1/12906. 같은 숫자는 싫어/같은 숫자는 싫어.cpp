#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    auto it = arr.begin();
    int pre = *(it++);
    answer.push_back(pre);
    for (auto it = arr.begin(); it != arr.end(); it++)
        if (pre != *it)
            answer.push_back(pre = *it);
    return answer;
}