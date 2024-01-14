function solution(my_string, queries) {
    var arr = my_string.split('');
    for (const q of queries) {
        for (var i = 0; q[0] + i < q[1] - i; i++) {
            var tmp = arr[q[0] + i];
            arr[q[0] + i] = arr[q[1] - i];
            arr[q[1] - i] = tmp;
        }
    }
    return arr.join('');
}