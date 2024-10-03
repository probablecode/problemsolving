#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, M;

    // N과 M 입력받기
    scanf("%d %d", &N, &M);

    // 배열 A, B 선언 및 입력받기
    int A[N], B[M];
    for (int i = 0; i < N; i++) {
        scanf("%d", &A[i]);
    }
    for (int i = 0; i < M; i++) {
        scanf("%d", &B[i]);
    }

    // 병합된 배열의 크기 및 선언
    int len = N + M;
    int arr[len];

    // 병합 과정
    int a = 0, b = 0, n = 0;
    while (a < N && b < M) {
        if (A[a] < B[b])
            arr[n++] = A[a++];
        else
            arr[n++] = B[b++];
    }

    // 남은 부분 추가
    while (a < N)
        arr[n++] = A[a++];
    while (b < M)
        arr[n++] = B[b++];

    // 결과 출력
    printf("%d", arr[0]);
    for (int i = 1; i < len; i++) {
        printf(" %d", arr[i]);
    }

    return 0;
}
