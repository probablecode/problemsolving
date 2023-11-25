#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int age) {
    int birth = 2022;
    while (1 < age--)
        birth--;
    return birth;
}