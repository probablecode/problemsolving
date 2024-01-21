function solution(strArr) {
    var lens = new Array(30).fill(0, 0, 30);
    strArr.forEach(v => lens[v.length - 1]++);
    return Math.max(...lens);
}