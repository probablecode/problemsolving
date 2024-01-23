function solution(arr) {
    return arr.concat(new Array(2 ** (Math.ceil(Math.log2(arr.length))) - arr.length).fill(0));
}