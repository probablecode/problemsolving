#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.

bool solution(const char* s) {
    int idx = 0, det = 0;
    while (s[idx])
    {
        if (s[idx] == '(')
            det++;
        else
            det--;
        if (det < 0)
            break;
        idx++;
    }
    return (det == 0);

}