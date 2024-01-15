function solution(a, b, c, d) {
    // 1. pppp
    // 2. ppp q <-> q ppp
    // 3. pp qq
    // 4. pp q r <-> q pp r <-> q r pp
    // 5. p, q, r, s
    var arr = new Array(7).fill(0);
    for (const num of arguments)
        arr[num]++;
    
    var max = Math.max(...arr);
    if (max === 4)
        return 1111 * arr.indexOf(max);
    if (max === 3)
        return (10 * arr.indexOf(max) + arr.indexOf(1)) ** 2;
    if (max === 2) {
        var lnum = arr.indexOf(max);
        var rnum = arr.lastIndexOf(max);
        if (lnum !== rnum)
            return rnum ** 2 - lnum ** 2;
        return arr.indexOf(1) * arr.lastIndexOf(1);
    }
    return arr.indexOf(1);
}