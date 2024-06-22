#include <string>
#include <vector>
#include <queue>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    
    vector<int> answer;    
    for (auto it = commands.begin(); it != commands.end(); it++) {
        priority_queue<int> pq;
        
        for (int i = (*it)[0] - 1; i < (*it)[1]; i++)
        {
            // 0. [암기없는 풀이] pq에서 -로 담근다.
            // 1. [compare 재정의] pq에서 담근다.
            // 2. [깡 sort도 써버릇 해]
            pq.push(-array[i]);
        }
        for (int ret = 1; ret < (*it)[2]; ret++)
            pq.pop();
        answer.push_back(-pq.top());
    }
    return answer;
}