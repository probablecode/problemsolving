function solution(rank, attendance) {
    const part = rank.filter((v, i) => attendance[i]);
    const prize = new Array(3);
    var answer = 0;
    for (var i = 0; i < 3; i++) {
        prize[i] = Math.min(...part);
        answer += rank.indexOf(prize[i]) * 10000 / (100 ** i);
        part[part.indexOf(prize[i])] = 100;
    }
    return answer;
}