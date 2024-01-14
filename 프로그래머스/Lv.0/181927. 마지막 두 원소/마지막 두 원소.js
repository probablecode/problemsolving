function solution(num_list) {
    const [a, b] = num_list.slice(-2);
    return [...num_list, a < b ? b - a : b * 2];
}