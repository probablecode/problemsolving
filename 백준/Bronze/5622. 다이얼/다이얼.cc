using namespace std;
#include <iostream>
int main(void) {
    string s;
    cin >> s;
    int ans = 0;
    for (int i = 0; i < s.size(); i++) {
        int ch = s[i];
        int num = 2;
        num += ('A' <= ch);
        num += ('C' < ch);
        num += ('F' < ch);
        num += ('I' < ch);
        num += ('L' < ch);
        num += ('O' < ch);
        num += ('S' < ch);
        num += ('V' < ch);
        ans += num;
    }
    cout << ans;
    return 0;
}