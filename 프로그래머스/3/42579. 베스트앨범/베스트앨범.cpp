#include <string>
#include <vector>
#include <unordered_map>
#include <map>
#include <set>
using namespace std;

struct Compare {
    bool operator () (const pair<int, int> &a, const pair<int, int> &b) const {
        if (a.first != b.first)
            return a.first > b.first;
        return a.second < b.second;
    }
};


vector<int> solution(vector<string> genres, vector<int> plays) {
    int len = plays.size();
    vector<int> answer;
    unordered_map<string, int> gTotal;
    unordered_map<string, multiset<pair<int, int>, Compare>> gPlays;
    for (int i = 0; i < len; i++) {
        string &g = genres[i];
        int p = plays[i];
        gTotal[g] += p;
        gPlays[g].insert({p, i});
    }
    map<int, string> tGenre;
    for (auto it = gTotal.begin(); it != gTotal.end(); it++)
        tGenre[it->second] = it-> first;
    for (auto it = tGenre.rbegin(); it != tGenre.rend(); it++) {
        auto ms = gPlays[it->second];
        auto top2 = ms.begin();
        answer.push_back(top2->second);
        top2++;
        if (top2 != ms.end())
            answer.push_back(top2->second);
    }
    return answer;
}




















// vector<int> solution(vector<string> genres, vector<int> plays) {
//     vector<int> answer;
//     size_t len = genres.size();
//     unordered_map<string, int> um0; // <genre, total>
//     unordered_map<string, multimap<int, int>> umm1; // <genre, <play, idx>>
//     for (int i = 0; i < len; i++) {
//         umm1[genres[i]].insert({plays[i], i});
//         um0[genres[i]] += plays[i];    
//     }
//     map<int, string> um1; // <total, genre>
//     for (auto it = um0.begin(); it != um0.end(); it++)
//         um1[it->second] = it->first;
//     for (auto it = um1.end(); it != um1.begin();) {
//         it--;
//         auto lt = umm1[it->second].end();
//         auto a = --lt;
//         if (umm1[it->second].size() == 1) {
//             answer.push_back(a->second);
//             continue;
//         }
//         auto b = --lt;
//         if (a->first == b->first && a->second > b->second) {
//             auto tmp = a;
//             a = b;
//             b = tmp;
//         }
//         answer.push_back(a->second);
//         answer.push_back(b->second);
//     }
//     return answer;
// }