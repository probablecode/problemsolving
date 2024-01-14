function solution(a, b, c) {
    var p = a === b;
    var q = b === c;
    var r = c === a;
    var answer = (a + b + c);
    if (!p && !q && !r)
        return answer;
    answer *= (a ** 2 + b ** 2 + c ** 2);
    if (!p || !q || !r)
        return answer;
    answer *= (a ** 3 + b ** 3 + c ** 3);
    return answer;
}