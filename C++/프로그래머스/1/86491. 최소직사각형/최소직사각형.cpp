#include <string>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

int solution(vector<vector<int>> sizes) {
    priority_queue<int> pq_x;
    priority_queue<int> pq_y;
    for (auto it = sizes.begin(); it != sizes.end(); it++) {
        if ((*it)[0] < (*it)[1])
            swap((*it)[0], (*it)[1]);
         pq_x.push((*it)[0]);
         pq_y.push((*it)[1]);
    }
    return pq_x.top() * pq_y.top();
}