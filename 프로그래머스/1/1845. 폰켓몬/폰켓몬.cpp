#include <vector>
#include <unordered_set>
using namespace std;

int solution(vector<int> nums)
{
    int nHalf = nums.size() / 2;
    unordered_set<int> unique;
    for (vector<int>::iterator it = nums.begin(); it != nums.end(); it++)
        unique.insert(*it);
    int uniq = unique.size();
    return uniq < nHalf ? uniq : nHalf;
}