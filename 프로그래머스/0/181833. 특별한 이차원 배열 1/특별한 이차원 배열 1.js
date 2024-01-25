function solution(n) {
    var answer = [];
    for (var i = 0; i < n ; i++) {
        answer.push([]);
        for (var j = 0; j < n; j++)
            answer[i].push(+(i === j));
    }
    return answer;
}