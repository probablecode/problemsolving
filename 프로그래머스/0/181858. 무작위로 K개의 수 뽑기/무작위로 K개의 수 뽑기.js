function solution(arr, k) {
    const answer = [];
    arr.forEach(v => answer.includes(v) ? 0 : answer.push(v));
    return answer.length < k ? answer.concat(new Array(k - answer.length).fill(-1)) : answer.slice(0, k);
}