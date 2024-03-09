#include <string>
#include <vector>
#include <queue>
using namespace std;

int solution(vector<int> sc, int K) {
    priority_queue<int, vector<int>, greater<int>> minPQ(sc.begin(), sc.end());    
    
    int answer = 0;
    while (1) {
        if (minPQ.empty())
            return -1;
        int min = minPQ.top();
        
        if (K <= min)
            break;
        minPQ.pop();
        
        if (minPQ.empty())
            return -1;
        min += (minPQ.top() * 2);
        minPQ.pop();
        
        minPQ.push(min);
        answer++;
    }
    return answer;
}