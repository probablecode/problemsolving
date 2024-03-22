#include <cstdio>
#include <vector>
#include <queue>
#include <iostream>
using namespace std;

const int INF = 1000000;
int min_[20001];
vector<pair<int, int>> edge[20001];
int V, E, K;
int    main(void) {
    for (int i = 0; i <= 20000; i++)
        min_[i] = INF;
    scanf("%d %d", &V, &E);
    scanf("%d", &K);
    int u, v, w;
    for (int i = 0; i < E; i++) {
        scanf("%d %d %d", &u, &v, &w);
        edge[u].push_back(make_pair(w, v));
    }
    min_[K] = 0;
    pair<int, int> cur(0, K);
    priority_queue<pair<int, int>> pq;
    pq.push(cur);
    while (!pq.empty()) {
        cur = pq.top();
        pq.pop();
        int from = -cur.first;
        auto e = edge[cur.second];
        for (int i = 0; i < e.size(); i++) {
            w = e[i].first;
            v = e[i].second;
            if (from + w < min_[v]) {
                min_[v] = from + w;
                pq.push(make_pair(-min_[v], v));
            }
        }
    }
    for (int i = 1; i <= V; i++) {
        if (min_[i] == INF)
            printf("%s", "INF\n");
        else
            printf("%d\n", min_[i]);
    }
    return 0;
}