#include<vector>
#include<queue>
#include <iostream>
using namespace std;
const int YET = -1;
vector<vector<int>> path;
queue<pair<int, int>> q;
int answer = -1, m = 0, n = 0;
void subBFS(vector<vector<int>> &maps, int i, int j, int current) {
    // cout << "[hmm] : " << i << ", " << j << endl;
    if (i < 0 || m <= i || j < 0 || n <= j)
        return;
    if (maps[i][j] == 1 && path[i][j] == YET) {
        path[i][j] = current + 1;
        q.push({i, j});
    }
}

void BFS(vector<vector<int>> &maps, pair<int, int> pos) {
    int i = pos.first;
    int j = pos.second;
    int current = path[i][j];
    // cout << i << ", " << j << " : " << current << endl;
    
     subBFS(maps, i - 1, j, current);
     subBFS(maps, i + 1, j, current);
     subBFS(maps, i, j - 1, current);
     subBFS(maps, i, j + 1, current);
}

int solution(vector<vector<int>> maps)
{
    m = maps.size();
    n = maps[0].size();
    for (int i = 0; i < m; i++)
    {
        vector<int> v(n, YET);
        path.push_back(v);
    }
    q.push({0, 0});
    path[0][0] = 1;
    while (!q.empty()) {
        auto node = q.front();
        q.pop();
        BFS(maps, node);
    }
    
    return path[m - 1][n - 1];
}