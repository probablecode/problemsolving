#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int fct(vector<int> &array, vector<int> commands) {
    vector<int> sub(array.begin() + commands[0] - 1, array.begin() + commands[1]);
    sort(sub.begin(), sub.end());
    return sub[commands[2] - 1];
}

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    
    for (int idx = 0; idx < commands.size(); idx++)
        answer.push_back(fct(array, commands[idx]));
    return answer;
}