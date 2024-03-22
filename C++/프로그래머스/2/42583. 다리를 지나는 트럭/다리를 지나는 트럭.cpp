#include <string>
#include <vector>
#include <queue>
using namespace std;

int load(queue<int> q) {
    int total = 0;
    while (!q.empty()) {
        total += q.front();
        q.pop();
    }
    return total;
}

int solution(int blen, int weight, vector<int> trucks) {
    int sec = 0;
    auto tIdx = 0;
    auto tLen = trucks.size();
    queue<int> q;
    for (int i = 0; i < blen; i++)
        q.push(0);
    
    while (true) {
        q.pop();
        int next = 0;
        if (load(q) + trucks[tIdx] <= weight) {
            next = trucks[tIdx];
            tIdx++;
        }
        q.push(next);
        sec++;
        if (tLen <= tIdx)
            break;
    }
    return sec + blen;
}