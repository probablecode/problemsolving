function solution(arr, n) {
    return arr.map((v, i) => i % 2 === arr.length % 2 ? v : v + n);
}