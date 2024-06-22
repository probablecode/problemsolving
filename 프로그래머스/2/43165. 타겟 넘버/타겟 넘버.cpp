#include <string>
#include <vector>

using namespace std;
int len = 0;
int answer = 0;
void dfs(const vector<int> &numbers, const int target, int sum, int idx) {
    if (len <= idx) {
        if (target == sum)
            answer++;
        return;
    }
    dfs(numbers, target, sum + numbers[idx], idx + 1);
    dfs(numbers, target, sum - numbers[idx], idx + 1);
}

int solution(vector<int> numbers, int target) {
    len = numbers.size();    
    dfs(numbers, target, 0, 0);
    return answer;
}