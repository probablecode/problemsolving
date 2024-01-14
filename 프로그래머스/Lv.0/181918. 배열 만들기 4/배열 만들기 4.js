function solution(arr) {
    var stk = [];
    arr.forEach((e) => {
        while (0 < stk.length && e <= stk.at(-1))
            stk.pop();
        stk.push(e);
    })
    return stk;
}