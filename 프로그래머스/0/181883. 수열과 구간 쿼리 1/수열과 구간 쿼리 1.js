function solution(arr, queries) {
    for (const [a, b] of queries)
        for (var i = a; i <= b; i++)
            arr[i]++;
    return arr;
}