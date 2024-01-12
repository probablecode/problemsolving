function solution(n) {
    let sum = 0;
    if (n % 2 == 0)
        for (i = 2; i <= n; i += 2)
            sum += i * i;
    else
        for (i = 1; i <= n; i += 2)
            sum += i;
    return sum;
}