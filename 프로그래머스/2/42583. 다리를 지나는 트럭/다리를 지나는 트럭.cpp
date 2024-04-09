#include <string>
#include <vector>
#include <queue>
using namespace std;

int load(queue<int> &q) {
    int w = 0;
    for (int i = 0; i < q.size(); i++) {
        auto f = q.front();
        w += f;
        q.pop();
        q.push(f);
    }
    return w;
}
 
int solution(int bl, int weight, vector<int> trucks) {
    int i = 0;
    int sec = 0;

    queue<int> q;
    for (int i = 0; i < bl; i++)
        q.push(0);
    
    while (true) {
        sec++;
        q.pop();
        if (load(q) + trucks[i] <= weight) {
            q.push(trucks[i++]);
            if (i == trucks.size())
                break;
        }
        else
            q.push(0);
    }
    return sec + bl;
}