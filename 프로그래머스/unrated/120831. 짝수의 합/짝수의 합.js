function solution(n) {
    var ans = 0;
    for (var l = 2; l <= n; l += 2)
        ans += l;
    return ans;
}