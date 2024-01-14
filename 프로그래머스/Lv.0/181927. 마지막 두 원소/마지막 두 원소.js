function solution(num_list) {
    var end = num_list.length - 1;
    var ans = num_list.slice(0);
    ans.push(ans[end - 1] < ans[end] ? (ans[end] - ans[end - 1]) : ans[end] * 2);
    return ans;
}