    
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int numer1, int denom1, int numer2, int denom2) {
    
    int numer = numer1 * denom2 + numer2 * denom1;
    int denom = denom1 * denom2;
    
    int small = (denom < numer ? denom : numer);
    int big = (small == denom ? numer : denom);

    while (small != 0)
    {
        int tmp = small;
        small = big % small;
        big = tmp;
    }
    int* answer = (int*)malloc(2 * sizeof(int));
    answer[0] = (numer / big);
    answer[1] = (denom / big);
    return answer;
}