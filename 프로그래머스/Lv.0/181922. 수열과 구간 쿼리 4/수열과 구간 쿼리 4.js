function solution(arr, queries) {
    for (const q of queries) {
        for (var i = q[0]; i <= q[1]; i++)
            if (i % q[2] === 0)
                arr[i]++;
    }
    return arr;
}