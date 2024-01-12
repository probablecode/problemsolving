function solution(a, b) {
    strA = a.toString();
    strB = b.toString();
    return Math.max(Number(`${strA}${strB}`), Number(`${strB}${strA}`));
}