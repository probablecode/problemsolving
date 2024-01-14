function solution(arr, queries) {
    var answer = [];
    for (const q of queries) {
        var min = Number.MAX_VALUE;
        for (var i = q[0]; i <= q[1]; i++)
            if (q[2] < arr[i] && arr[i] < min)
                min = arr[i];
        answer.push(min === Number.MAX_VALUE ? -1 : min);        
    }
    return answer;
}