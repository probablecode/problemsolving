#include <string>
#include <vector>
#include <queue>
#include <map>
using namespace std;

int solution(vector<vector<int>> jobs) {
    
    struct CompareA {
        bool operator() (vector<int> a, vector<int> b) {
            return a[0] > b[0];
        }
    };
    struct CompareB {
        bool operator() (vector<int> a, vector<int> b) {
            return a[1] > b[1];
        }
    };
    
    
    priority_queue<vector<int>, vector<vector<int>>, CompareA> total(jobs.begin(), jobs.end());
    priority_queue<vector<int>, vector<vector<int>>, CompareB> req;
    int sum = 0;    
    int now = 0;
    while (1) {
        while (!total.empty()) {  
            auto top = total.top();    
            if (now < top[0])
                break;
            req.push(top);
            total.pop();
        }
        if (req.empty()) {
            if (total.empty())
                break;
            now = total.top()[0];
            continue;
        }
        auto task = req.top();       
        now += task[1];
        sum += (now - task[0]);
        req.pop();
    }
    return sum / jobs.size();
}