#include <string>
#include <vector>
#include <queue>
using namespace std;

priority_queue<int> answer;
vector<bool> done(8, false);
int len = 0;

void back_track(const vector<vector<int>> &dg, int fatigue, int sum, int count) {
    if (count == 0) {
        answer.push(sum);
        return;
    }
    for (int i = 0; i < len; i++) {
        if (!done[i])
        {   
            int sub = 0;
            int add = 0;
            done[i] = true;
            if (dg[i][0] <= fatigue)
            {
                sub = dg[i][1];
                add++;
            }
            back_track(dg, fatigue - sub, sum + add, count - 1);
            done[i] = false;
        }
    }
}
int solution(int k, vector<vector<int>> dungeons) {

    len = dungeons.size();
    back_track(dungeons, k, 0, len);
    return answer.top();
}