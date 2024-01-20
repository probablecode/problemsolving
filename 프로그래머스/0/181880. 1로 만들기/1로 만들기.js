function solution(num_list) {
    return num_list.reduce((acc, v) => acc + Math.floor(Math.log2(v)), 0);
}