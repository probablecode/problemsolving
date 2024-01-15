function solution(my_string) {
    var answer = [];
    for (var i = my_string.length - 1; 0 <= i; i--) {
        answer.push(my_string.substring(i, my_string.length));
    }
    return answer.sort();
}