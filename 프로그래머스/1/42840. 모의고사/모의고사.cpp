#include <string>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> answers) {
    int a = 0, b = 0, c = 0;
    int aArr[5] = {1, 2, 3, 4, 5};
    int bArr[8] = {2, 1, 2, 3, 2, 4, 2, 5};
    int cArr[10] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    for (int i = 0; i < answers.size(); i++) {
        int answer = answers[i];
        a += (answer == aArr[i % 5]);
        b += (answer == bArr[i % 8]);
        c += (answer == cArr[i % 10]);    
    }
    priority_queue<pair<int, int>> pq;

    pq.push(make_pair(a, 1));
    pq.push(make_pair(b, 2));
    pq.push(make_pair(c, 3));
    
    vector<int> answer;
    auto p1 = pq.top();
    answer.push_back(p1.second);
    pq.pop();
    auto p2 = pq.top();
    if (p1.first == p2.first) {
        answer.push_back(p2.second);
        pq.pop();
        p1 = pq.top();
        if (p1.first == p2.first) 
            answer.push_back(p1.second);
    }
    sort(answer.begin(), answer.end());
    return answer;
}