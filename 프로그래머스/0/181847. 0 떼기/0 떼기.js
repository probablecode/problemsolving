function solution(n_str) {
    for (var i = 0; n_str[i] === '0'; i++)
        ;
    return n_str.slice(i);
}