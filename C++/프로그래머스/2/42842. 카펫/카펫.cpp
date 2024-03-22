#include <string>
#include <vector>
#include <cmath>
using namespace std;

vector<int> solution(int brown, int yellow) {
    int b = brown / 2 - 2;
    int c = yellow;
    
    int d = sqrt(b * b - c * 4);
    vector<int> answer;
    answer.push_back((b + d) / 2 + 2);
    answer.push_back((b - d) / 2 + 2);
    return answer;
}