#include <string>
#include <vector>
#include <cmath>
using namespace std;

vector<int> solution(int a, int b) {
    double D = pow((double)a / 2 - 2, 2) - b * 4;
    D = sqrt(D);
    double sum =  (double)a / 2 + 2;
    vector<int> answer;
    answer.push_back((int)(sum + D) / 2);
    answer.push_back((int)(sum - D) / 2);
    return answer;
}