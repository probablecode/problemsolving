#include <string>
#include <vector>
#include <queue>
using namespace std;

int solution(vector<int> scoville, int K) {    
    priority_queue<int, vector<int>, greater<int>> minHeap(scoville.begin(), scoville.end());
    int answer = 0;
    
    while (!minHeap.empty()) {
        int one = minHeap.top();
        if (K <= one)
            return answer;
        minHeap.pop();
        if (minHeap.empty())
            break;
        int two = minHeap.top();
        minHeap.pop();
        minHeap.push(one + two * 2);
        answer++;
    }
    return (-1);    
}