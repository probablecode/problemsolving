function solution(my_string, index_list) {
    return index_list.reduce((ret, idx) => ret += my_string[idx], '');
}