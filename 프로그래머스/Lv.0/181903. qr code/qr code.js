function solution(q, r, code) {
    var answer = '';
    for (var i = r; i < code.length; i += q)
        answer += code[i];
    return answer;
}