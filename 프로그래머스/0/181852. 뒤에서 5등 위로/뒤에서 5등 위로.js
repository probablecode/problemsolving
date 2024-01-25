function solution(num_list) {
    return Array.from(num_list).sort((a, b) => Number(a) - Number(b)).slice(5);
}