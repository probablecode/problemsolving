#include <vector>
#include <unordered_set>
using namespace std;

int solution(vector<int> nums)
{
    unordered_set<int> us;
    for (vector<int>::iterator it = nums.begin(); it != nums.end(); it++)
        us.insert(*it);
    
    return us.size() < nums.size() / 2 ? us.size() : nums.size() / 2;
}