#include <stdio.h>
#include <stdlib.h>

#define MAX_NUM 10000000  // 문제의 숫자 범위에 따라 적절히 설정

int main() {
    int N, M;
    
    // N 입력
    scanf("%d", &N);

    // 해시맵 역할을 대신할 배열 선언
    int hMap[MAX_NUM * 2 + 1] = {0};  // 음수 범위도 고려

    // 첫 번째 배열 입력 받아 빈도 계산
    for (int i = 0; i < N; i++) {
        int num;
        scanf("%d", &num);
        hMap[num + MAX_NUM]++;  // 배열 인덱스를 음수까지 고려해 변환
    }

    // M 입력
    scanf("%d", &M);
    
    // 결과 저장할 배열
    int ans[M];

    // 두 번째 배열 입력 받아 결과 계산
    for (int i = 0; i < M; i++) {
        int num;
        scanf("%d", &num);
        ans[i] = hMap[num + MAX_NUM];  // 빈도 값 저장
    }

    // 결과 출력
    printf("%d", ans[0]);
    for (int i = 1; i < M; i++) {
        printf(" %d", ans[i]);
    }

    return 0;
}