#include <string>
#include <vector>
#include <queue>
using namespace std;

int solution(vector<int> priors, int location) {
    int answer = 0; 
    priority_queue<int> pq(priors.begin(), priors.end());
    queue<pair<int, int>> que;
    for (int i = 0; i < priors.size(); i++)
        que.push(pair(i, priors[i]));
    while (!que.empty()) {
        auto node = que.front();
        que.pop();
        if (node.second == pq.top()) {
            pq.pop();
            answer++;
            if (node.first == location)
                break;
        }
        else
            que.push(node);
    }
    return answer;
}