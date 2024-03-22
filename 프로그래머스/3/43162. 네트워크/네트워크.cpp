#include <string>
#include <vector>
#include <queue>

using namespace std;
int visited[200] = {0, };
int remain = 0;
int N = 0;

void trav(int idx, queue<int> &q, vector<vector<int>> &mtx) {
    for (int i = 0; i < N; i++) {
        if (mtx[idx][i] && visited[i] == 0) {
            visited[i] = 1;
            remain--;
            q.push(i);
        }
    }
}

int solution(int n, vector<vector<int>> mtx) {
    N = n;
    remain = n;
    int answer = 0;
    queue<int> q;
    while (0 < remain) {
        answer++;
        int idx = 0;
        while (idx < n && visited[idx])
            idx++;
        visited[idx] = 1;
        remain--;
        q.push(idx);
        while (!q.empty()) {
            int next = q.front();
            q.pop();
            trav(next, q, mtx);
        }
    }
    return answer;
}