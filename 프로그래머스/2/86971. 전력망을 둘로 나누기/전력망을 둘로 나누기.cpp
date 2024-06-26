#include <string>
#include <vector>
#include <queue>
#include <unordered_set>
using namespace std;

priority_queue<int> pq;
int count = 0;


int findNode(vector<vector<int>> &wires, unordered_set<int> &net, int idx) {
    int find = 0;

    for (int i = 0; i < count - 1; i++) {
        if (i != idx) {
            int x = wires[i][0], y = wires[i][1];
            auto xIt = net.find(x);
            auto yIt = net.find(y);
            if (xIt != net.end() && yIt == net.end()) {
                net.insert(y);
                find++;
            }
            if (xIt == net.end() && yIt != net.end()) {
                net.insert(x);
                find++;
            }
        }
    }
    return find;
}
void choice(vector<vector<int>> &wires, int idx) {
    unordered_set<int> a;
    unordered_set<int> b;
    int find;
    a.insert(1);
    do {
        find = findNode(wires, a, idx);
    } while (0 < find);
    
    for (int i = 1; i <= count; i++) {
        if (a.find(i) == a.end())
            b.insert(i);
    }
    int sizeA = a.size();
    int sizeB = b.size();
    
    int diff = sizeA < sizeB ? sizeB - sizeA : sizeA - sizeB ;

    pq.push(-diff);
}

int solution(int n, vector<vector<int>> wires) {
    count = n;    
    for (int i = 0; i < n - 1; i++)
        choice(wires, i);
    return -pq.top();
}