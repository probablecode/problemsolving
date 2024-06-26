#include <string>
#include <vector>

using namespace std;

void clearNet(vector<vector<int>> &mtx, const int n, const int idx) {
    vector<int> toClear;
    for (int j = 0; j < n; j++) {
        if (mtx[idx][j] == 1) {
            toClear.push_back(j);
            mtx[idx][j] = 0;
    
        }
    }
    for (auto it = toClear.begin(); it != toClear.end(); it++) {
        clearNet(mtx, n, *it);
    }
}

int solution(int n, vector<vector<int>> computers) {
    int answer = 0;
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (computers[i][j] == 1) {
                clearNet(computers, n, i);
                answer++;
            }
        }
    }
    return answer;
}