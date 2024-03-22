#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> prices) {    
    auto len = prices.size();
    vector<int> answer;
    
    for (auto i = 0; i < len; i++) {
        int num = 0;
        for (auto j = i + 1; j < len; j++) {
            num++;
            if (prices[j] < prices[i])
                break;
        }
        answer.push_back(num);
    }
    return answer;
}