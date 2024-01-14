function solution(n, control) {
    var move = "wsda";
    var diff = [1, -1, 10, -10];
    for (const c of control)
        n += diff[move.indexOf(c)]
    return n;
}