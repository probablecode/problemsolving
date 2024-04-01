#include <string>
#include <vector>
#include <queue>
using namespace std;

struct CCompare {
    bool operator() (const string &a, const string &b) {
        string ab = a + b;
        string ba = b + a;
        return ab < ba;
    }
};

string solution(vector<int> numbers) {
    priority_queue<string, vector<string>, CCompare> hp;
    for (auto it = numbers.begin(); it != numbers.end(); it++)
        hp.push(to_string(*it));
    string answer = "";
    if (hp.top() == "0")
        return "0";
    while (!hp.empty()) {
        answer += hp.top();
        hp.pop();
    }
    return answer;
}