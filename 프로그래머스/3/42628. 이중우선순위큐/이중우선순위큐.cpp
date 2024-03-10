#include <string>
#include <vector>
#include <set>
using namespace std;

vector<int> solution(vector<string> op) {
    multiset<int> ms;
    
    for (auto it = op.begin(); it != op.end(); it++) {
        int ch = (*it)[0];
        int num = stoi(it->substr(2));
        if (ch == 'I')
            ms.insert(num);
        else if (!ms.empty()) {
            if (num == 1) {
                ms.erase(*ms.rbegin());
            }
            else if (num == -1)
                ms.erase(*ms.begin());
        
        }
    }
    vector<int> answer;
    if (ms.empty())
        answer.insert(answer.end(), {0, 0});
    else
        answer.insert(answer.end(), {*(ms.rbegin()), *(ms.begin())});
    return answer;
}