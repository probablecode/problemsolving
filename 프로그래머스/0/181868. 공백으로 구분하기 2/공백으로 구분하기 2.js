function solution(my_string) {
    return my_string.split(' ').filter(v => 0 < v.length);
}