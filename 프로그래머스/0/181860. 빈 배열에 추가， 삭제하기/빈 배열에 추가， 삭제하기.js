function solution(arr, flag) {    
    var answer = [];
    for (var i = 0; i < flag.length; i++) {
        if (flag[i])
            answer.push(... new Array(arr[i] * 2).fill(arr[i]));
        else
            answer.splice(-arr[i]);
    }
    return answer;
}