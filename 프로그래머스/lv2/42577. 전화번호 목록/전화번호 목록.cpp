#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool solution(vector<string> pb) {
    sort(pb.begin(), pb.end());
    vector<string>::iterator it = pb.begin();
    while (it != pb.end())
    {
        vector<string>::iterator tmp = it++;
        if (it != pb.end() && !it->find(*tmp))
            return false;
    }
    return true;
}