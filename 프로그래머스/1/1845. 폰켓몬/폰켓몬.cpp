#include <vector>
#include <set>
using namespace std;

int solution(vector<int> nums)
{
    set<int> ms;
    for (auto it = nums.begin(); it != nums.end(); it++)
        ms.insert(*it);
    auto pick = nums.size() / 2;
    return pick < ms.size() ? pick : ms.size();    
}