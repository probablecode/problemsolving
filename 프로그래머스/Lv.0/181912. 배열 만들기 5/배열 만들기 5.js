function solution(intStrs, k, s, l) {
    var answer = [];
    for (var i = 0; i < intStrs.length; i++) {
        var num = Number(intStrs[i].substring(s, s + l));
        if (k < num)
            answer.push(num);
    }
    return answer;
}