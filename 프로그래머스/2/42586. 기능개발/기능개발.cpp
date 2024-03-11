#include <string>
#include <vector>
using namespace std;

vector<int> solution(vector<int> pro, vector<int> s) {
    vector<int> answer;
    auto len = pro.size();
    for (int day = 1, idx = 0;idx < len; day++) {
        int cnt = 0;
        if (100 <= pro[idx + cnt] + day * s[idx + cnt]) {
            cnt++;
            while (idx + cnt < len && 100 <= pro[idx + cnt] + day * s[idx + cnt])
                cnt++;
            answer.push_back(cnt);
            idx += cnt;
        }
    }
    return answer;
}