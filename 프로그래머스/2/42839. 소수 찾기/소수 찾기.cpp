#include <string>
#include <vector>
#include <unordered_set>

using namespace std;
int answer = 0;
int len = 0;
vector<bool> choice(7, 0);
unordered_set<int> us;

bool isPrime(int num) {
    if (num <= 1)
        return 0;
    else if (num == 2)
        return 1;
    int sqrt = 1;
    while (sqrt * sqrt < num)
        sqrt++;
    for (int i = 2; i <= sqrt; i++)
        if (num % i == 0)
            return 0;
    return 1;
}

void back_track(const char * const nums, int select, int value) {
    if (select == 0) {
        auto it = us.find(value);
        if (it == us.end() && isPrime(value)) {
            us.insert(value);
            answer++;
        }
        return;
    }
    value *= 10;
    for (int i = 0; i < len; i++) {
        if (!choice[i]) {
            choice[i] = true;
            back_track(nums, select - 1, value + (nums[i] - '0'));
            choice[i] = false;
        }
    }
}

int solution(string numbers) {
    len = numbers.size();
    const char * nums = numbers.c_str();
    for (int cnt = len; 0 < cnt; cnt--) {
        back_track(nums, cnt, 0);
    }
    return answer;
}