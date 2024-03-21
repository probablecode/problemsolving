#include <iostream>
using namespace std;
int main(void) {
    string s;
    while (getline(cin, s) || !cin.eof())
        cout << s << endl;
    return 0;
}