function solution(my_string, s, e) {
    
    var reversed = my_string.substring(s, e + 1).split('').reverse();
    var str = my_string.split('');
    str.splice(s, e - s + 1, ...reversed);
    return str.join('');
}