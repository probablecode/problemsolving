#include <vector>
#include <stack>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    auto it = arr.begin();
    int pre = *it;
    answer.push_back(*(it++));
    while (it != arr.end()) {
        if (pre != *it) {
            pre = *it;
            answer.push_back(*it);
        }
        it++;
    }
    return answer;
}