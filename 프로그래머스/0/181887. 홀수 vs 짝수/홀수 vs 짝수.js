function solution(num_list) {
    return Math.max(...num_list.reduce((ret, v, idx) => {
        ret[idx % 2] += v;
        return ret;
    }, [0, 0]));
}
