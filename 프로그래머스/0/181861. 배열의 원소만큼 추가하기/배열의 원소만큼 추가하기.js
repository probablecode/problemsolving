function solution(arr) {
    var answer = [];
    for (const n of arr)
        answer.push(...new Array(n).fill(n));
    return answer;
}