#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

int solution(vector<vector<string>> cl) {
    unordered_map<string, int> um;
    int answer = 1;
    for (auto it = cl.begin(); it != cl.end(); it++) {
        auto tag = (*it)[1];
        if (0 < um.count(tag))
            um[tag]++;
        else
            um[tag] = 1;    
    }
    for (auto it = um.begin(); it != um.end(); it++) {
        answer *= (it->second + 1);
    }
    return answer - 1;
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////////////////////////
// int solution(vector<vector<string>> cl) {
//     unordered_map<string, int> ums;
//     for (auto it = cl.begin(); it != cl.end(); it++)
//         ums[(*it)[1]] += 1;
//     int ret = 1;
//     for (auto it = ums.begin(); it != ums.end(); it++)
//         ret *= (it->second + 1);
//     return ret - 1;
// }