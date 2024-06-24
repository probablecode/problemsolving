#include <vector>
#include <unordered_set>
using namespace std;

int solution(vector<int> nums)
{
    unordered_set<int> us;
    int select = nums.size();
    for (int i = 0; i < select; i++)
        us.insert(nums[i]);
    int unique = us.size();
    select /= 2;
    return select < unique ? select : unique;
}