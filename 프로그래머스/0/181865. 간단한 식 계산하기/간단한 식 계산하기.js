function solution(binomial) {
    var ex = binomial.split(' ');
    var a = Number(ex[0]), b = Number(ex[2]);
    return ex[1] === '+' ? a + b : (ex[1] === '-' ? a - b : a * b);
}