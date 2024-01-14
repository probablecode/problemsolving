function solution(n) {
    var answer = [n];
    for (var x = n; x !== 1;) {
        if (x % 2 === 0)
            x /= 2;
        else
            x = x * 3 + 1;
        answer.push(x);
    }
    return answer;
}