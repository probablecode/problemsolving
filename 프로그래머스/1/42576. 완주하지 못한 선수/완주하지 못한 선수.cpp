#include <string>
#include <vector>

// multiset으로도, map으로도 가능하다.
#include <set> // input에 오류가 없다고 하고 풀어보자.
using namespace std;

string solution(vector<string> par, vector<string> com) {
    multiset<string> ms;
    for (auto it = par.begin(); it != par.end(); it++)
        ms.insert(*it);
    for (auto it = com.begin(); it != com.end(); it++)
        ms.erase(ms.find(*it));    
    return *(ms.begin());
}