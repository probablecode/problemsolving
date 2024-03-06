#include <string>
#include <vector>
#include <unordered_map>
#include <iostream>
using namespace std;

string solution(vector<string> par, vector<string> com) {
    unordered_map<string, int> um;
    for (vector<string>::iterator it = par.begin(); it != par.end(); it++) {
        auto ex = um.find(*it);
        if (ex == um.end())
            um.insert({*it, 1});
        else
            ex->second++;
    }
    for (vector<string>::iterator it = com.begin(); it != com.end(); it++) {
        auto ex = um.find(*it);
        ex->second--;
        if (ex->second == 0)
            um.erase(ex->first);
    }
    return um.begin()->first;
}