#include <string>
#include <vector>
#include <set>
#include <iostream>

using namespace std;

#include <iostream>
struct Compare {
    bool operator () (const int a, const int b) {
        return a < b;
    }
    
};


bool solution(vector<string> pb) {
    set<string> s;
    
    for (auto it = pb.begin(); it != pb.end(); it++) {
        s.insert(*it);
    }
    auto it = s.begin();
    while (true) {
        auto pre = it++;
        if (it == s.end())
            break;
        else if (it->find(*pre) == 0)
            return false;
    }
    return true;
}

// bool solution(vector<string> pb) {
//     set<string> s;
//     for (auto it = pb.begin(); it != pb.end(); it++)
//         s.insert(*it);
//     for (auto it = s.begin();;) {
//          auto tmp = it++;
//          if (it == s.end())
//              return true;
//          else if (it->find(*tmp) == 0)
//              break;
//     }
//     return false;
// }
