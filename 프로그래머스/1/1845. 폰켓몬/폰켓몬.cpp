
#include <vector>
#include <unordered_set>
using namespace std;
int solution(vector<int> nums){
    unordered_set<int> us;   
    for (auto it = nums.begin(); it != nums.end(); it++)
        us.insert(*it);
    auto ticket = nums.size() / 2;
    return us.size() < ticket ? us.size() : ticket;
}