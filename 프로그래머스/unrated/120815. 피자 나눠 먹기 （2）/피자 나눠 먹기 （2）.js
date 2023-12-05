function solution(n) {
    var answer = 0;
    let x = 1;
    while ((x * 6) % n)
        x++;
    return x;
}