function solution(numbers, n) {
    var sum = 0
    for (var i = 0; sum <= n; i++)
        sum += numbers[i];
    return sum;
}