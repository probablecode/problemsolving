function solution(num_list) {
    if (10 < num_list.length)
        return num_list.reduce((acc, v) => acc + v, 0);
    else
        return num_list.reduce((acc, v) => acc * v, 1);
}