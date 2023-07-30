#include <string>
#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct cmp1stEl {
    bool operator()(const std::vector<int>& v1, const std::vector<int>& v2) const {
        return v1[0] > v2[0]; // '>'를 사용하여 오름차순 정렬 (최소 힙)
    }
};

struct cmp2ndEl {
    bool operator()(const std::vector<int>& v1, const std::vector<int>& v2) const {
        return v1[1] > v2[1]; // '>'를 사용하여 오름차순 정렬 (최소 힙)
    }
};

int solution(vector<vector<int>> jobs) {
    int time = 0, sum = 0;
    priority_queue<vector<int>, vector<vector<int> >, cmp1stEl> seq(jobs.begin(), jobs.end());
    priority_queue<vector<int>, vector<vector<int> >, cmp2ndEl> task;
    
    while (!seq.empty()) {
        if (time < seq.top()[0] && task.empty())
            time = seq.top()[0];
        while (!seq.empty() && seq.top()[0] <= time) {
            task.push(seq.top());
            seq.pop();
        }
        time += task.top()[1];
        sum += (time - task.top()[0]);
        task.pop();
    }
    while (!task.empty()) {
        time += task.top()[1];
        sum += (time - task.top()[0]);
        task.pop();
    }
    return (sum / jobs.size());
}