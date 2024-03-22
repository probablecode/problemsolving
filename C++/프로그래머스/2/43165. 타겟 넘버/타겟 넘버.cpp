#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int target) {
    int n = numbers.size();
    int count = 0;
    for (int i = 1; i < (1 << n); i++) {
        int num = 0;
        for (int j = 0; j < n; j++) {
            if (i & (1 << j))
                num += numbers[j];
            else
                num -= numbers[j];
        }
        if (num == target)
            count++;
    }
    return count;
}