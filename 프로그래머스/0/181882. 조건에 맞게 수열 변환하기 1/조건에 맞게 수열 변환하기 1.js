function solution(arr) {
    return arr.map((v) => v * (50 <= v && v % 2 === 0 ? 0.5 : (v < 50 && v % 2 === 1 ? 2 : 1)));
}