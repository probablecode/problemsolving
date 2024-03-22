#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> pro, vector<int> sp) {
    int day = 0, idx = 0, len = pro.size();
    vector<int> answer;
        
    while (idx < len) {
        if (pro[idx] + sp[idx] * day < 100)
            day++;
        else {
            int num = 1;
            while (true) {
                idx++;
                if (len <= idx || pro[idx] + sp[idx] * day < 100)
                    break;
                num++;
            }
            answer.push_back(num);
        }
    }
    return answer;
}