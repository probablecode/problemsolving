#include <string>
#include <vector>
#include <unordered_set>

using namespace std;

string solution(vector<string> par, vector<string> com) {
    unordered_multiset<string>  ums;
    for (vector<string>::iterator it = par.begin(); it != par.end(); it++)
        ums.insert(*it);
    for (vector<string>::iterator it = com.begin(); it != com.end(); it++) {
        ums.erase(ums.find(*it));
    }
    return *(ums.begin());
}