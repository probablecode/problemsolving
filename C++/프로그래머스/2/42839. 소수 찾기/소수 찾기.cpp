#include <string>
#include <vector>
#include <algorithm>
#include <unordered_set>
#include <iostream>
using namespace std;

int isprime(int num) {
    if (num < 3)
        return (num == 2);
    int sqrt = 2;
    while (sqrt * sqrt < num)
        sqrt++;
    if (num % 2 == 0)
        return 0;
    for (int div = 3; div <= sqrt; div += 2) {
        if (num % div == 0)
            return 0;
    }
    return 1;
}

int solution(string numbers) {
    int answer = 0;
    auto len = numbers.length();
    vector<string> nums;
    unordered_set<int> us;
    for (int i = 0; i < len; i++)
        nums.push_back(string(1, numbers[i]));
    sort(nums.begin(), nums.end());
    
    for (int i = 1; i < (1 << len); ++i) {
        vector<string> comb;
        for (int j = 0; j < len; ++j) {
            if (i & (1 << j))
                comb.push_back(nums[j]);
        }
        do {
            string str = "";
            for (int i = 0; i < comb.size(); i++)
                str += comb[i];
            int num = stoi(str);
            if (us.find(num) == us.end()) {
                us.insert(num);
                answer += isprime(num);
            }
        } while (next_permutation(comb.begin(), comb.end()));
    }
    return answer;
}