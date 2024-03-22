#include <string>
#include <vector>
#include <queue>
#include <iostream>
using namespace std;

const int inf = 50000;
int min_[20001];
vector<int> edge_[20001];
int solution(int n, vector<vector<int>> edge) {
    for (int i = 1; i <= n; i++)
        min_[i] = inf;

    priority_queue<pair<int, int>> pq;
    for (auto it = edge.begin(); it != edge.end(); it++) {
        vector<int> &e = *it;
        edge_[e[0]].push_back(e[1]);
        edge_[e[1]].push_back(e[0]);
    }
    min_[1] = 0;
    pair<int, int> p(0, 1);
    pq.push(p);
    while (!pq.empty()) {
        p = pq.top();
        pq.pop();
        auto &it = edge_[p.second];
        for (int i = 0; i < it.size(); i++) {
            int dst = it[i];
            int dist = -p.first;
            if (dist + 1 < min_[dst]) {
                min_[dst] = dist + 1;
                pq.push(make_pair(-min_[dst], dst));
            }
        }
    }
    priority_queue<int> dis;
    for (int i = 1; i <= n; i++){
        dis.push(min_[i]);
    }
        int top = dis.top();
    int cnt = 0;
    while (!dis.empty() && dis.top() == top) {
        cnt++;
        dis.pop();
    };
    return cnt;
}