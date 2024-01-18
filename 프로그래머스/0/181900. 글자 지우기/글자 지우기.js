function solution(my_string, indices) {
    return my_string.split('').filter((it, i) => !indices.includes(i)).join('');
}