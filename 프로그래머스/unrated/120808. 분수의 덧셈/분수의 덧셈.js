function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    var numer = numer1 * denom2 + numer2 * denom1;
    var denom = denom1 * denom2;
    
    let small = Math.min(numer, denom);
    let big = Math.max(numer,denom);    
    while (small != 0)
    {
        const tmp = small;
        small = big % small;
        big = tmp;
    }
    answer.push(numer / big);
    answer.push(denom / big);
    return answer;        
}