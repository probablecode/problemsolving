#include <string>
#include <vector>
#include <set>
#include <iostream>

using namespace std;

bool solution(vector<string> pb) {
    set<string> s;
    for (auto it = pb.begin(); it != pb.end(); it++)
        s.insert(*it);
    for (auto it = s.begin();;) {
         auto tmp = it++;
         if (it == s.end())
             return true;
         else if (it->find(*tmp) == 0)
             break;
    }
    return false;
}