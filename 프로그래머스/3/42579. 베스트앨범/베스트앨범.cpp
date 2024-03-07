#include <string>
#include <vector>
#include <unordered_map>
#include <map>
using namespace std;

vector<int> solution(vector<string> genres, vector<int> plays) {
    vector<int> answer;
    size_t len = genres.size();
    unordered_map<string, int> um0; // <genre, total>
    unordered_map<string, multimap<int, int>> umm1; // <genre, <play, idx>>
    for (int i = 0; i < len; i++) {
        umm1[genres[i]].insert({plays[i], i});
        um0[genres[i]] += plays[i];    
    }
    map<int, string> um1; // <total, genre>
    for (auto it = um0.begin(); it != um0.end(); it++)
        um1[it->second] = it->first;
    for (auto it = um1.end(); it != um1.begin();) {
        it--;
        auto lt = umm1[it->second].end();
        auto a = --lt;
        if (umm1[it->second].size() == 1) {
            answer.push_back(a->second);
            continue;
        }
        auto b = --lt;
        if (a->first == b->first && a->second > b->second) {
            auto tmp = a;
            a = b;
            b = tmp;
        }
        answer.push_back(a->second);
        answer.push_back(b->second);
    }
    return answer;
}