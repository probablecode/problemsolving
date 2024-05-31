#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> prog, vector<int> speeds) {
    vector<int> answer;
    int day = 1;
    int idx = 0;
    while (idx < prog.size()) {
        int dist = 0;
        while (idx < prog.size() && 100 <= prog[idx] + speeds[idx] * day)
        {
            dist++;
            idx++;
        }
        if (0 < dist)
            answer.push_back(dist);        
        day++;    
    }
    return answer;
}