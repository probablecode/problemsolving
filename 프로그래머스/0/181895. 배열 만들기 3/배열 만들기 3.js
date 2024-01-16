function solution(arr, gap) {
    return arr.slice(gap[0][0], gap[0][1] + 1)
        .concat(arr.slice(gap[1][0], gap[1][1] + 1));
}