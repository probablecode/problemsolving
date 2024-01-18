function solution(arr) {
    var a = arr.indexOf(2);
    var b = arr.lastIndexOf(2) + 1;
    return a === -1 ? [-1] : arr.slice(a, b);
}