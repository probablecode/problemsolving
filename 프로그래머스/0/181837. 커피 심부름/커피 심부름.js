function solution(order) {
    return order.reduce((a, v) => a + (v.includes("cafelatte") ? 5000 : 4500), 0);
}