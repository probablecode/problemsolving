#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX 1000000

bool number[MAX + 1];

int main() {
    number[0] = true;
    number[1] = true;

    // 에라토스테네스의 체를 이용한 소수 판별
    for (int i = 2; i * i <= MAX; i++) {
        if (!number[i]) {
            for (int j = i * i; j <= MAX; j += i)
                number[j] = true;
        }
    }

    int primeList[MAX];
    int primeCount = 0;
    primeList[primeCount++] = 3;
    primeList[primeCount++] = 5;

    int check = 12;
    while (check < MAX) {
        if (!number[check - 5])
            primeList[primeCount++] = check - 5;
        if (!number[check - 1])
            primeList[primeCount++] = check - 1;
        check += 6;
    }
    if (check - 5 < MAX && !number[check - 5])
        primeList[primeCount++] = check - 5;
    if (check - 1 < MAX && !number[check - 1])
        primeList[primeCount++] = check - 1;

    int num;
    while (1) {
        scanf("%d", &num);
        if (num == 0) break;
        bool wrong = true;
        for (int i = 0; i < primeCount; i++) {
            int prime = primeList[i];
            if (num - prime > 0 && !number[num - prime]) {
                printf("%d = %d + %d\n", num, prime, num - prime);
                wrong = false;
                break;
            }
        }
        if (wrong)
            printf("Goldbach's conjecture is wrong.\n");
    }

    return 0;
}