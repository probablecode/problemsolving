function solution(num_list) {
    sum = (acc, elem) => acc + elem;
    prod = (acc, elem) => acc * elem;
    return num_list.reduce(prod, 1) < num_list.reduce(sum, 0) ** 2 ? 1 : 0;
}