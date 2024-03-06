#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

int solution(vector<vector<string>> cl) {
    unordered_map<string, int> ums;
    for (auto it = cl.begin(); it != cl.end(); it++)
        ums[(*it)[1]] += 1;
    int ret = 1;
    for (auto it = ums.begin(); it != ums.end(); it++)
        ret *= (it->second + 1);
    return ret - 1;
}