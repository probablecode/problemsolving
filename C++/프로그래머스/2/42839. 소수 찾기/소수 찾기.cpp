#include <string>
#include <vector>
#define MAX 10000000
using namespace std;
enum Prime {
    Prime,
    NonPrime,
};
void get_primes(vector<bool>& primes) {
    primes[0] = NonPrime;
    primes[1] = NonPrime;
    for (int i = 2; i * i < MAX; ++i) {
        if (primes[i]) {
            continue;
        }
        for (int j = i * i; j < MAX; j += i) {
            primes[j] = NonPrime;
        }
    }
}
void back_tracking(const vector<bool>& primes, string& numbers, vector<bool>& visit,int& ret, int& answer) {
    for (int i = 0; i < numbers.length(); ++i) {
        if (numbers[i] == '-') {
            continue;
        }
        ret = ret * 10 + (numbers[i] - '0');
        if (primes[ret] == Prime && !visit[ret]) {
            visit[ret] = true;
            answer += 1;
        }
        char tmp = numbers[i];
        numbers[i] = '-';
        back_tracking(primes, numbers, visit, ret, answer);
        numbers[i] = tmp;
        ret /= 10;
    }
}
int solution(string numbers) {
    int answer = 0;
    int ret = 0;
    vector<bool> primes(MAX);
    vector<bool> visit(MAX);
    get_primes(primes);
    back_tracking(primes, numbers, visit, ret, answer);
    return answer;
}