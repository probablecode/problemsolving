function solution(num_str) {
    return num_str.split('').reduce((a, v) => a + Number(v), 0);
}