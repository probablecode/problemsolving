function solution(my_string, alp) {
    var tmp = my_string;
    Array(alp).forEach((v) => { tmp = tmp.replaceAll(v, v.toUpperCase())});
    return tmp;
}