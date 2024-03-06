#include <string>
#include <vector>
#include <unordered_set>
using namespace std;

string solution(vector<string> par, vector<string> com) {
    unordered_multiset<string> um;
    for (vector<string>::iterator it = par.begin(); it != par.end(); it++)
        um.insert(*it);
    for (vector<string>::iterator it = com.begin(); it != com.end(); it++)
        um.erase(um.find(*it));
    return *um.begin();
}