function solution(arr) {
    const len = arr.length;
    var stk = [];
    for (var i = 0; i < len; i++) {
        if (stk.length === 0)
            stk.push(arr[i]);
        else if (stk[stk.length - 1] === arr[i])
            stk.pop();
        else
            stk.push(arr[i]);
    }
    return stk.length ? stk : [-1];
}