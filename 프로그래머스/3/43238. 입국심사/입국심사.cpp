#include <string>
#include <vector>
#include <iostream>
using namespace std;

long long solution(int n, vector<int> times) {
    long long r = 1000000000000000000;
    long long l = 1, answer = r;
    
    while (l <= r) {
        long long mid = (l + r) / 2;
        long long sum = 0;
        for (int t : times)
            sum += mid / t;
        if (n <= sum) {
            answer = mid;
            r = mid - 1;
        }
        else
            l = mid + 1;     
    }
    return answer;
}