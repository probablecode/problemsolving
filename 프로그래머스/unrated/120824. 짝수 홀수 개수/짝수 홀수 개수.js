function solution(num_list) {
    var odd = num_list.filter(item => item % 2).length;
    return [num_list.length - odd, odd];
}