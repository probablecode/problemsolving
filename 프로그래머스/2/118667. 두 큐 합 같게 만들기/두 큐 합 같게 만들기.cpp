#include <string>
#include <vector>
#include <queue>
using namespace std;

long long sumA;
long long sumB;
queue<int> qA;
queue<int> qB;

long long initQueue(queue<int> &q, vector<int> qV) {
    long long sum = 0;
    for (int n : qV) {
        q.push(n);
        sum += (long long)n;
    }
    return sum;
}

void sendToA() {
    auto node = qB.front();
    qB.pop();
    qA.push(node);
    sumB -= node;
    sumA += node;
}

void sendToB() {
    auto node = qA.front();
    qA.pop();
    qB.push(node);
    sumA -= node;
    sumB += node;
}


int solution(vector<int> queue1, vector<int> queue2) {
    const int count = queue1.size() + queue2.size();
    sumA = initQueue(qA, queue1);
    sumB = initQueue(qB, queue2);
    
    if ((sumA + sumB) % 2 == 1)
        return -1;
    
    for (int i = 0; i < count * 3; i++) {
        if (sumA == sumB)
            return i;
        else if (sumA < sumB)
            sendToA();
        else
            sendToB();
    }
    return -1;
}