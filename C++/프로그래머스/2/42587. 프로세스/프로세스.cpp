#include <string>
#include <vector>
#include <queue>
using namespace std;

int solution(vector<int> pri, int location) {
    priority_queue<int> pq(pri.begin(), pri.end());
    queue<pair<int, int>> q;
    int turn = 0;
    for (auto i = 0; i < pri.size(); i++)
        q.push(pair(i, pri[i]));
    while (true) {
        auto node = q.front();
        q.pop();
        if (node.second == pq.top()) {
            turn++;
            pq.pop();
            if (node.first == location)
                break;
        }
        else
            q.push(node);
    }
    return turn;
}