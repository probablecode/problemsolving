function solution(arr, queries) {
    for (const q of queries) {
        var tmp = arr[q[0]];
        arr[q[0]] = arr[q[1]];
        arr[q[1]] = tmp;
    }
    return arr;
}