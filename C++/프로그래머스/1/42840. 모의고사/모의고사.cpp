#include <string>
#include <vector>
#include <queue>

using namespace std;

int a_(int idx) {
    return (idx % 5) + 1;
}

int b_(int idx) {
    int rem = idx % 8;
    if (rem % 2) {
        return rem - (4 < rem) - (6 < rem);
    }
    return 2;
}

int c_(int idx) {
    switch ((idx % 10) / 2) {
        case 0 :
            return 3;
        case 1 :
            return 1;
        case 2 :
            return 2;
        case 3 :
            return 4;
        case 4 :
            return 5;
    }
    return 0;
}

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int a = 0, b = 0, c = 0;
    for (int i = 0; i < answers.size(); i++) {
        a += (answers[i] == a_(i));
        b += (answers[i] == b_(i));
        c += (answers[i] == c_(i));
    }
    priority_queue<int> pq;
    pq.push(a);pq.push(b);pq.push(c);
    int top = pq.top();
    if (a == top)
        answer.push_back(1);
    if (b == top)
        answer.push_back(2);
    if (c == top)
        answer.push_back(3);
    return answer;
}