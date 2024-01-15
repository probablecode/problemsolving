function solution(l, r) {
    var answer = [];
    function itof(idx) {
        var ret = [];
        for (var i = idx; 0 < i; i = Math.floor(i / 2))
            ret.push(i % 2);
        return Number(ret.reverse().join('')) * 5;    
    }
    var idx = 0;
    while (itof(idx) < l) {
        idx++;
    }
    while (true) {
        var num = itof(idx);
        if (r < num) {
            break;
        }
        answer.push(num);
        idx++;
    }
    return answer.length === 0 ? [-1] : answer;
}